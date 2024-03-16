**PARTE III. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC**

**Comenzando con Spring Inicializr**



Navegue a https://start.spring.io . Este servicio incorpora todas las dependencias que necesita para una aplicación y realiza la mayor parte de la configuración por usted.
Elija Gradle o Maven y el idioma que desea utilizar. Esta guía asume que usted eligió Java.
Haga clic en Dependencias y seleccione Spring Web , Thymeleaf y Spring Boot DevTools .
Haga clic en Generar .
Descargue el archivo ZIP resultante, que es un archivo de una aplicación web configurada con sus opciones.

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/53050fc3-facf-4905-9dbc-c0251ffc28b6)

**Crear un controlador web**

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/c2adcf46-513d-4d5f-b7c3-b622c1328fd9)

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/40a06275-b765-4c8d-b5ec-1929f6eb4320)

**Ejecute la aplicación**

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/baf823fc-05c4-4d85-84f2-4467d3382705)

**probar el ejecutable**

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/024642c1-ef73-4f80-9253-6d8bc79f7104)

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/ed9ee377-353f-4b9a-8e22-d288add156ce)

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/58c21fe5-dbc4-488c-a0fd-3dacdd8bda99)

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/ff6d7258-2b43-4e7f-8b82-3e71fa546d22)

**¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial)**

MVC, que significa Modelo-Vista-Controlador, es un patrón de diseño arquitectónico utilizado comúnmente en el desarrollo de software, especialmente en el desarrollo de aplicaciones web

**¿Cuáles son las ventajas de usar MVC?**

el uso del patrón MVC proporciona una estructura organizativa clara, promueve la reutilización de código, facilita el mantenimiento y la escalabilidad, y ofrece flexibilidad tecnológica, lo que contribuye a un desarrollo de software más eficiente y robusto.

**¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?**

Este proyecto cuenta con un apartado para la vista(presentacion), donde se encuentran los estilos y codigo html

Ahora, haz el request GET http://localhost:8080/greeting usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?

**PARTE IV. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful**

Usando la arquitectura MVC del punto anterior (el proyecto anterior), realice una aplicación simple qué permita navegar gráficamente sobre esta API https://jsonplaceholder.typicode.com/todos/1, puede guiarse de tutoriales como https://medium.com/@nutanbhogendrasharma/consume-rest-api-in-spring-boot-web-application-354c404850f0

Controlador de task

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/b2af7078-c25e-4f6c-b6c3-6465afbd270f)

html task

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/cb7763f2-649c-4394-9a9f-5c79ae91d063)

Navegador 

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/7e82aaa8-9cd6-441b-8456-6ef9be56a732)

Luego de terminada esta parte responda:

*¿Qué es RESTful?*

un servicio web RESTful es aquel que sigue los principios de REST, utilizando URIs para identificar recursos, utilizando operaciones HTTP estándar para manipular recursos y utilizando representaciones para comunicar información entre el cliente y el servidor. Esto permite una arquitectura de sistema flexible, escalable y fácil de entender.

Si utilizo un framework como Boostrap CSS para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?

el uso de Bootstrap CSS estaría principalmente en la capa de vista (o en la capa de presentación) de la arquitectura de software, donde se define cómo se muestra la interfaz de usuario al usuario final. Esto implica agregar clases y componentes de Bootstrap CSS a los archivos HTML, plantillas de motor de vistas o componentes frontend para aprovechar su funcionalidad y estilo predefinido.

**PARTE V. - APLICACIÓN MVC JUEGO**

¡Llego la hora del reto! Teniendo las bases del uso del framework, cree una nueva ruta, por ejemplo /guess, y agrege formulario básico con un campo llamado "número" (guía de como crear formularios HTML https://www.w3schools.com/html/)

Y vamos a implementar la lógica de nuestro juego:

Se trata de un juego en línea para adivinar un número, en el que el ganador, si acierta en la primera oportunidad, recibe $100.000. Luego, por cada intento fallido, el premio se reduce en $10.000, como en los juegos de apuesta, es natural qué quede en saldos negativos.
El número a adivinar debe ser generado en cada intento y comparado con el número qué el usuario está insertando, es un número de 1 a 10.
Debe existir un botón de reset, qué permita al jugador iniciar de nuevo.
La capa de controlador debe procer el número del usuario mediante método POST.

*Controlador game*

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/b636885a-e6c0-432e-bd7d-b46623a9f1c8)

*html game*

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/86e5d7ca-be42-4298-8936-fcd7501d0425)

*navegador inicial*

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/c56312b8-ebbe-484b-8215-fae2612a3c39)

*navegador respuesta correcta* 

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/d576a2a3-f937-4b75-a15f-ca92420b59cc)

*navegador respuesta incorrecta* 

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/f1ce7255-5556-4d74-9b90-d14d8a64a02f)

¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?

Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?


