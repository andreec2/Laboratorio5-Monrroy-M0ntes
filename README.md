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

Pretty

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/01afede6-b070-4724-a056-185ac542751b)

Raw

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/dd494a27-64b3-4bf3-9af5-78a68c2b2014)

Responde las siguientes preguntas:

¿Qué pasa si no envío el método correcto?

Si en Postman no se envía el método correcto al realizar una solicitud HTTP, es probable que obtengas un error o una respuesta inesperada del servidor. Esto se debe a que los servidores esperan recibir solicitudes HTTP con métodos específicos, como GET, POST, PUT, DELETE, etc., y si la solicitud no coincide con el método esperado, el servidor puede responder con un código de estado HTTP apropiado, como 405 (Método no permitido) o 400 (Solicitud incorrecta).

¿Qué pasa si al body response HTML lo fuerzo a leerse como JSON?

Cuando solicitas un recurso al servidor, este responde según el tipo de contenido solicitado y según la configuración del servidor. Si el servidor devuelve una respuesta con el encabezado Content-Type establecido como text/html, indica que el contenido es HTML. Si intentas interpretar este HTML como JSON, es probable que recibas un error de análisis ya que los formatos de datos son diferentes y no pueden ser interpretados de la misma manera.

¿Por qué el preview de HTML no se ve igual a cuando accedo a la URL en un navegador web?

La razon por la cual la preview y la pagina se ven diferentes puede ser por el uso de css y javascript que tienen implementados el navegador web y postman no ejecuta.

*¿Qué pasa si le envías un body a una solicitud GET?*

PARTE II. - CLIENT SIDE RENDERING CON REACT
Para iniciar verifica que tengas alguna de estas herramientas:

NPM o YARN
Verificando en terminal sería $ npm init

La siguiente misión es ejecutar una aplicación react localmente:

Abre la aplicación https://codesandbox.io/s/react-js-simple-calculator-pefmr, loguéate con GitHub y juega cambiando los parámetros como colores y duplicando las líneas del archivo App.js con tags como <ResultComponent ...> en la función render.

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/c3f1a856-bcac-465a-961e-c35d6327af8f)

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/57f9936a-53ca-401c-b869-b0294dedeef5)

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/3dc69bee-cb1c-40d9-9975-d314e0b6abe2)

¿Qué hace cada uno de los archivos en la aplicación? 

*index.html*

Este archivo HTML es el archivo de entrada principal para una aplicación web desarrollada utilizando React, un popular marco de trabajo de JavaScript para construir interfaces de usuario. 

*App.js*

Este archivo JavaScript define el componente principal de una calculadora simple construida con React, incluyendo la lógica para manejar las interacciones del usuario y mostrar el resultado en la interfaz de usuario.

*KeyPadComponent.js*

Este componente define los botones de la calculadora y maneja los eventos de clic en esos botones, comunicándose con el componente principal a través de la función onClick pasada como una prop.

*ResultComponent.js* 

Este componente define el área donde se mostrará el resultado de la calculadora y muestra el resultado dentro de un párrafo, utilizando la prop result pasada al componente.

*index.js* 

Este archivo se encarga de iniciar la aplicación React y renderizar el componente principal App en el DOM dentro del elemento con el id "root", todo ello dentro de un entorno de modo estricto para facilitar el desarrollo.

*styles.css*

Estos estilos controlan el diseño y la apariencia de los diferentes elementos de la calculadora, como el área de visualización del resultado, los botones y el diseño general de la calculadora.

Después de haber visto los cambios, vuelve a abrir la URL original https://codesandbox.io/s/react-js-simple-calculator-pefmr y sigue los siguientes pasos:

Descargar código en un Zip
Descomprimir el Zip en la carpeta de proyectos de software, (en ciertos PC solo funciona 7-Zip)
Abrir una terminal de Git Bash en la carpeta descomprimida
Instalar las dependencias con npm install

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/0a4fe3a8-321c-4b8b-96ab-2686ccf833f8)

Iniciar la aplicación con npm start, en algunos computadores con versiones antiguas de nodejs hay que agregar NODE_OPTIONS=--openssl-legacy-provider npm run start
Si te sale el Firewall dale click en cancelar

![image](https://github.com/andreec2/Laboratorio5-Monrroy-M0ntes/assets/99145156/69da5259-c1e1-4b6f-bcf5-e78bcc7395bd)

Abrir la ruta http://localhost:3000/ en un navegador web como Firefox o Google Chrome
Ahora, haz el request GET http://localhost:3000/ usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?
