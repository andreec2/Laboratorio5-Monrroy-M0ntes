package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLOutput;

@Controller
public class AppController {

    private final GameGuess gameGuess;
    @Autowired
    public AppController(GameGuess gameGuess) {
        this.gameGuess = gameGuess;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }


    @RequestMapping("/task/{id}")
    private ModelAndView  getUser(@PathVariable Integer id, Model model) {
        String uri = "https://jsonplaceholder.typicode.com/todos/" + id;
        RestTemplate restTemplate = new RestTemplate();

        Task task = restTemplate.getForObject(uri, Task.class);

        ModelAndView modelAndView = new ModelAndView("task");
        modelAndView.addObject("task", task);

        return modelAndView;
    }

    @GetMapping("/guess")
    public String mostrarFormulario(Model model) {
        model.addAttribute("prize", gameGuess.getPrize());
        return "guess";
    }

    @PostMapping("/guess")
    public String procesarFormulario(@RequestParam("numero1") String numero1, @RequestParam(name = "reiniciar", required = false) String reiniciar,Model model) {
        System.out.println("Es vacio?" + numero1.isEmpty());
        if (!(numero1.isEmpty())) {
            System.out.println(numero1);
            boolean ans = gameGuess.comparation(Integer.parseInt(numero1));
            //System.out.println(ans);
            if (ans) {
                gameGuess.maxPrize();
                System.out.println(gameGuess.getPrize());
                model.addAttribute("message", "¡Felicidades! adivinaste el número, tu premio es de $" + gameGuess.getPrize());
            } else {
                gameGuess.reducePrize();
                model.addAttribute("message", "Fallaste, ahora me debes mas dinero. Tu premio actual es de $" + gameGuess.getPrize());
            }
        } else{
            System.out.println("huuuuuuh");
        }
        if (reiniciar != null) {
            gameGuess.restart();
        }
        return "guess";
    }
}