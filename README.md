# PatternCommand - Example

![vista-logica](vista-logica.png)

# Prop�sito
Encapsular una petici�n como un objeto, de modo que puedan parametrizarse otros objetos con distintas peticiones o colas de peticiones y proporcionar soporte para realizar operaciones que puedan deshacerse.

En el contexto de programaci�n actual un simple programa puede ejecutar decenas, o incluso centenares, de invocaciones a subprocesos o subprogramas. En ocasiones es muy conveniente desacoplar la invocaci�n de determinados procesos del contexto donde se encuentran, y �sto es precisamente el problema que viene a solucionar el patr�n Command.
Por ejemplo, un objeto bot�n o men� ejecuta solicitudes, pero la solicitud no est� implementada dentro del mismo.
Otro ejemplo del patr�n es que nos permite abstraer el c�digo de tal manera que podamos tratar a los objetos como si fueran las ordenes que introducimos un la CLI (Interfaz de L�nea de Comandos) del sistema operativo.
Adem�s, pueden surgir situaciones en las que las invocaciones deban de tratarse por medio de una cola, pila o estructura de datos similar. Mediante el patr�n Command podemos realizar estas acciones de manera sencilla.
