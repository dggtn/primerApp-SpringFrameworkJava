<header>
      <h1>Primer App con Spring Framework - Java</h1>
  </header>

  <section>
      <h2>Descripción del Proyecto</h2>
      <p>Este proyecto es una aplicación básica desarrollada utilizando el <strong>Spring Framework</strong> en Java. El objetivo es aprender y aplicar los conceptos fundamentales de Spring, como la configuración de dependencias, controladores, servicios, y la conexión con bases de datos. Este es un proyecto de iniciación para comprender cómo trabajar con Spring y sus características principales, como Inyección de Dependencias (DI) y desarrollo de aplicaciones RESTful.</p>
  </section>

  <section>
      <h2>Objetivos del Proyecto</h2>
      <ul>
          <li>Aprender los conceptos básicos de Spring Framework.</li>
          <li>Crear una aplicación web sencilla usando Spring Boot.</li>
          <li>Implementar controladores REST y gestionar rutas HTTP.</li>
          <li>Aplicar el concepto de Inyección de Dependencias (DI) en una aplicación.</li>
          <li>Gestionar datos con Spring, realizando operaciones CRUD (Crear, Leer, Actualizar, Eliminar).</li>
      </ul>
  </section>

  <section>
      <h2>Tecnologías Utilizadas</h2>
      <ul>
          <li><strong>Java</strong>: Lenguaje de programación utilizado para el desarrollo del backend.</li>
          <li><strong>Spring Boot</strong>: Framework utilizado para facilitar el desarrollo de aplicaciones Java.</li>
          <li><strong>Spring Web</strong>: Para construir controladores y manejar solicitudes HTTP REST.</li>
          <li><strong>Thymeleaf</strong>: Motor de plantillas para generar vistas en el lado del servidor (si aplica).</li>
          <li><strong>JPA</strong>: Java Persistence API, utilizada para la gestión de bases de datos.</li>
          <li><strong>H2</strong>: Base de datos en memoria para pruebas y desarrollo (opcional). Puede ser reemplazada por cualquier otra base de datos.</li>
      </ul>
  </section>

  <section>
      <h2>Funcionalidades Implementadas</h2>
      <p>Este proyecto implementa varias funcionalidades básicas:</p>
      <ul>
          <li><strong>Controladores REST:</strong> Manejamos solicitudes HTTP GET, POST, PUT, DELETE para interactuar con los datos.</li>
          <li><strong>Listas de elementos:</strong> La aplicación permite almacenar y manipular listas de objetos, con funciones agregadas para gestionar estos datos.</li>
          <li><strong>Inyección de Dependencias:</strong> Utilizamos Spring para inyectar servicios en los controladores y manejar las dependencias.</li>
          <li><strong>Conexión con base de datos:</strong> Usamos JPA para gestionar las operaciones CRUD con una base de datos H2 (en memoria) o cualquier otra base de datos relacional.</li>
      </ul>
  </section>

  <section>
      <h2>Estructura del Proyecto</h2>
      <p>La estructura básica del proyecto es la siguiente:</p>
      <pre>
primerApp-SpringFrameworkJava/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ejemplo/
│   │   │           └── primerApp/
│   │   │               ├── controller/
│   │   │               │   └── Controlador.java       # Controlador para gestionar las solicitudes HTTP
│   │   │               ├── service/
│   │   │               │   └── Servicio.java          # Lógica de negocio
│   │   │               ├── model/
│   │   │               │   └── Elemento.java          # Modelo de datos
│   │   │               └── PrimerAppApplication.java   # Clase principal que inicializa la aplicación
│   │   └── resources/
│   │       ├── application.properties  # Configuración de la aplicación
│   │       └── static/                 # Archivos estáticos (CSS, JS, imágenes)
│   │       └── templates/              # Plantillas Thymeleaf (si aplica)
│
└── README.html                           # Este archivo README en formato HTML
      </pre>
  </section>

  <section>
      <h2>Instrucciones para Ejecutar el Proyecto</h2>
      <p>Para ejecutar este proyecto en tu máquina local, sigue estos pasos:</p>
      <ol>
          <li><strong>Clona el repositorio:</strong>
              <pre>git clone https://github.com/dggtn9/primerApp-SpringFrameworkJava.git</pre>
          </li>
          <li><strong>Accede al directorio del proyecto:</strong>
              <pre>cd primerApp-SpringFrameworkJava</pre>
          </li>
          <li><strong>Compila y ejecuta la aplicación:</strong>
              <p>Si utilizas un IDE como Eclipse o IntelliJ IDEA, abre el proyecto y ejecútalo como una aplicación Spring Boot.</p>
              <p>Si prefieres usar la línea de comandos, asegúrate de tener Maven o Gradle instalado y ejecuta el siguiente comando:</p>
              <pre>mvn spring-boot:run</pre>
          </li>
      </ol>
  </section>

  <section>
      <h2>Contribuciones</h2>
      <p>Si deseas contribuir al proyecto, sigue estos pasos:</p>
      <ol>
          <li><strong>Haz un fork del repositorio:</strong> Esto te permitirá tener tu propia copia para hacer cambios.</li>
          <li><strong>Crea una nueva rama:</strong> Antes de realizar cualquier cambio, crea una nueva rama con un nombre descriptivo:
              <pre>git checkout -b feature/nueva-funcionalidad</pre>
          </li>
          <li><strong>Realiza tus cambios:</strong> Agrega nuevas funcionalidades, corrige errores o mejora el código.</li>
          <li><strong>Haz commit de tus cambios:</strong>
              <pre>git commit -m "Descripción de los cambios realizados"</pre>
          </li>
          <li><strong>Sube tus cambios:</strong>
              <pre>git push origin feature/nueva-funcionalidad</pre>
          </li>
          <li><strong>Abre un pull request:</strong> Después de subir tus cambios, abre un pull request para que podamos revisar tus modificaciones.</li>
      </ol>
  </section>

  <section>
      <h2>Licencia</h2>
      <p>Este proyecto está bajo la licencia <strong>MIT</strong>. Puedes ver los detalles en el archivo <code>LICENSE</code>.</p>
  </section>

  <section>
      <h2>Agradecimientos</h2>
      <p>Agradecemos a todos los colaboradores que contribuyan a este proyecto, y a los profesores que nos guiaron en el aprendizaje del Spring Framework.</p>
  </section>

</body>
</html>
