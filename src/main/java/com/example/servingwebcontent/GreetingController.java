package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

@Controller
public class GreetingController {

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
    public String mostrarFormulario() {
        return "guess";
    }

    @PostMapping("/guess")
    public String procesarFormulario(@RequestParam("numero1") String numero1) {
        // Trata el número aquí
        System.out.println("Número 1: " + numero1);
        String page = "";
        if (numero1 == null || numero1.isEmpty()){
            page = "guess";
            System.out.println("HUUUUUH");
        } else{
            page = "answer";
            System.out.println("UHHHHHHHHHU");
        }
        return page;
    }

    @GetMapping("/answer")
    public String mostrarFormulario1() {
        return "answer";
    }
    @PostMapping("/answer")
    public String answer(@RequestParam("numero1") String numero1, @RequestParam(value = "accion", required = false) String accion) {
        System.out.println("El número ingresado es: " + numero1);
        String page = "answer";
        if ("Reiniciar".equals(accion)) {
            // El usuario presionó el botón "Enviar", así que nos quedamos en la página answer
            page = "guess";
        }
        return page;
    }

}