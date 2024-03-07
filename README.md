# Laboratorio5-Monrroy-M0ntes
LABORATORIO 5 - SPRING MVC INTRODUCTION
INTRODUCCIÓN A PROYECTOS WEB
PARTE I. - JUGANDO A SER UN CLIENTE HTTP
Usaremos las siguientes aplicaciones como cliente HTTP

Postman
Telnet
Abre la aplicación Postman, lo usaremos para hacer una solicitud a un servidor HTTP, al abrirlo indentifica qué controles de Postman corresponde a los elementos de entrada y salida de un servicio HTTP:

image
Has un request GET a la URL https://www.escuelaing.edu.co/es/ y verifica el body de respuesta en las opciones Pretty, Raw, Preview.

Pretty
![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/e89f137d-5b26-4e0b-ac16-5e1e3bc6de9e)
Raw
![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/dddbf873-2792-44c6-a02b-d55d2cef4eed)
Preview
![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/16ef0fe0-80d5-4c57-8d19-a8b9bd83561e)

Ahora has otro request GET al recurso https://dummyjson.com/todos, nuevamente verifica el body en varias opciones.

Responde las siguientes preguntas:

¿Qué pasa si no envío el método correcto?
¿Qué pasa si al body response HTML lo fuerzo a leerse como JSON?
¿Por qué el preview de HTML no se ve igual a cuando accedo a la URL en un navegador web?
¿Qué pasa si le envías un body a una solicitud GET?
Como parte del laboratorio en casa has los dos request anteriores pero ahora usando la herramienta Telnet, ya que esta no funciona adecuadamente en los equipos del laboratorio.

PARTE II. - CLIENT SIDE RENDERING CON REACT
Para iniciar verifica que tengas alguna de estas herramientas:

NPM o YARN
Verificando en terminal sería $ npm init

La siguiente misión es ejecutar una aplicación react localmente:

Abre la aplicación https://codesandbox.io/s/react-js-simple-calculator-pefmr, loguéate con GitHub y juega cambiando los parámetros como colores y duplicando las líneas del archivo App.js con tags como <ResultComponent ...> en la función render.

¿Qué hace cada uno de los archivos en la aplicación? . ├── package.json ├── public │   └── index.html └── src ├── App.js ├── components │   ├── KeyPadComponent.js │   └── ResultComponent.js ├── index.js └── styles.css

Después de haber visto los cambios, vuelve a abrir la URL original https://codesandbox.io/s/react-js-simple-calculator-pefmr y sigue los siguientes pasos:

Descargar código en un Zip
Descomprimir el Zip en la carpeta de proyectos de software, (en ciertos PC solo funciona 7-Zip)
Abrir una terminal de Git Bash en la carpeta descomprimida
Instalar las dependencias con npm install
Iniciar la aplicación con npm star, en algunos computadores con versiones antiguas de nodejs hay que agregar NODE_OPTIONS=--openssl-legacy-provider npm run start
Si te sale el Firewall dale click en cancelar
Abrir la ruta http://localhost:3000/ en un navegador web como Firefox o Google Chrome
Ahora, haz el request GET http://localhost:3000/ usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?
