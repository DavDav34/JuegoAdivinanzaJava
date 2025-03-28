# Juego Adivinanza Java

El objetivo de la práctica es desarrollar un programa en Java que implemente un juego de adivinanza de números, utilizando ciclos como for, while y do-while. El programa debe generar un número aleatorio entre 1 y 100, y el usuario tendrá un número limitado de intentos para adivinarlo, recibiendo pistas después de cada intento. El juego finalizará cuando el usuario adivine el número o se agoten los intentos. Además, los estudiantes trabajarán en equipo, utilizando GitHub para el control de versiones del código y Microsoft Planner para la gestión de tareas y colaboración.

## ¿Cómo se compila y se ejecuta el proyecto?
Para poder hacer uso de este proyecto se tendrá que descargar el archivo llamado "Juego Adivinanza Java Ejecutable", una vez hecho se deberá de usar en un Compilador de Java.

## Funcionamiento del proyecto
##### 1) Generación del número aleatorio:
- Se crea un objeto de la clase Random para generar números aleatorios.
- nextInt(100) genera un número aleatorio entre 0 y 99. Al sumarle 1, obtenemos un número aleatorio entre 1 y 100, que será el número que el jugador tiene que adivinar.

![1 1](https://github.com/user-attachments/assets/4cc23dd4-3713-43fb-86cb-dc243a93d1e2)

##### 2) Configuración de los intentos:
- El número máximo de intentos es 10. Si el jugador no adivina el número después de 10 intentos, pierde.

![2 1](https://github.com/user-attachments/assets/35231e1b-b2e7-4b39-ba7b-f16ef74ae8f1)

##### 3) Entrada del jugador:
- El programa muestra un mensaje de bienvenida y explica al jugador cómo jugar.
- El jugador debe ingresar su intento, y el programa validará si el número está en el rango permitido (entre 1 y 100).

![3 1](https://github.com/user-attachments/assets/c6fdcaaf-301b-4613-be91-d1973fdbde74)

##### 4) Lógica de los intentos:
- El ciclo while se ejecuta mientras el jugador no haya agotado los intentos.
  
![4 1](https://github.com/user-attachments/assets/15185735-5415-4cc3-adbf-1952ba16a8e6)

- Si el número ingresado está fuera del rango (menor que 1 o mayor que 100), se muestra un mensaje de error y se vuelve a solicitar un nuevo número.

![4 2](https://github.com/user-attachments/assets/46d25a2d-5102-4fe2-bbb1-664490e026c5)

##### 5) Condiciones de victoria y derrota:
- Si el jugador adivina el número correctamente, se muestra un mensaje de felicitación.

![5 1](https://github.com/user-attachments/assets/209fd649-eb9b-425f-9560-237b1659b0cd)

- Si el jugador agota todos sus intentos sin adivinar, se muestra el número correcto.

![5 2](https://github.com/user-attachments/assets/5d86df69-6231-4c6d-bf08-c0514a98caed)

##### 6) Pistas de mayor o menor:
- Si el número ingresado no es correcto, se da una pista sobre si el número es mayor o menor:

![6 1](https://github.com/user-attachments/assets/7a685d4a-acd1-4751-a99d-18fdf31c492d)

##### 7) Visualización de intentos restantes:
-Después de cada intento, el programa muestra cuántos intentos le quedan al jugador.
![7 1](https://github.com/user-attachments/assets/8639c99f-4f61-4c05-864f-f8f64b02b707)

## Prueba del proyecto
- INTENTO 1

![1](https://github.com/user-attachments/assets/7d4ca72c-3860-4b5a-85bd-5bba6358b2c1)

- INTENTO 2

![2](https://github.com/user-attachments/assets/e92c2a9f-a098-4355-aea5-f55594db90aa)


## Enlace al Repositorio en GitHub
[Haga clic aquí para dirigirse al repositorio de GitHub](https://github.com/DavDav34/JuegoAdivinanzaJava.git)

## Enlace al tablero de Microsoft Planner
[Haga clic aquí para dirigirse al tablero de Microsoft Planner](https://planner.cloud.microsoft/webui/plan/DLRHog5yPUuZwtwijFDI2GQAA2qe/view/board?tid=f94bf4d9-8097-4794-adf6-a5466ca28563)
