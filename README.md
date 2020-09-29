# TaskBackendUsers-IETI

# Autor

#### Carlos Andrés Ramírez Torres
#### IETI 

# Uso

* Iniciar Backend: https://pure-reef-37959.herokuapp.com/
* Iniciar Frontend: https://taks-392bd.firebaseapp.com/
* Ingresar a la aplicación dando click en **Sing In**
* Para ver los usuarios del sistema Click en Users que aparece en el NavBar de la aplicación

# Direcciones del proyecto

* Container Docker in heroku backend users

https://pure-reef-37959.herokuapp.com/

* FireBase React Frontend

https://taks-392bd.firebaseapp.com/

# Despliegue React en FireBase

* Generar build del proyecto mediante el comando ```npm run build```

``` firebase init ```

* Seleccionar con tecla espacio **host** y presionar enter.

Datos pedidos:
* build
* y
* n

``` firebase deploy ```


# Despliegue container Heroku

Desde el terminar en donde se encuentra el proyecto y el **Dockerfile** aplicar los siguientes comandos.

``` heroku login ```

``` heroku container:login ```

``` heroku create ```

``` heroku container:push web --app < Nombre container create > ```

``` heroku container:release web --app < Nombre container create > ```


------

La presencia de este documento en este repositorio es un compromiso explícito de los colaboradores de seguir el siguiente código de honor:

Código de Honor
------
Debes seguir el Código de honor del ingeniero de sistemas para defender el estándar de integridad académica de la ECI:

- Tus respuestas a tareas, cuestionarios y exámenes deben ser tu propio trabajo (excepto para las tareas que permiten explícitamente la colaboración).

- No puedes compartir tus soluciones de tareas, cuestionarios o exámenes con otra persona a menos que el instructor lo permita explícitamente. Esto incluye cualquier cosa escrita por ti, como también cualquier solución oficial proporcionada por el docente o el monitor del curso.

- No puedes participar en otras actividades que mejorarán de manera deshonesta tus resultados o que mejorarán de manera deshonesta o dañarán los resultados de otras personas.
