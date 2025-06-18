## 1 
lograr un software en que cada parte es independiente, para que sea mas mantenible y facil de probar. Esto lo logra separandolo en capas
## 2 
separa la logica de negocio, facilita pruebas, mejora el mantenimiento y escalabilidad, permite cambiar el codigo sin afectar otras partes
## 3
### Domain: 
es la logica y el como debe estar estructurado todas lar partes del negocio.
### casos de uso 
organizar la logica para cumplir las tareas o funciones
### interface
conotroladores, presentadores y DTOs
### infraestructura
es encargado de la base de datos entre otros elementos necesarios para que el entorno funcione
## 4
se recomienda desacoplar la logica de negocio para que este no dependa de detalles tecnicos
## 5
### usecase 
ejecuta acciones desde la capa de aplicacion ejemplo "actualizar producto"
### service
contiene la logica que implementa las funciones, todo lo demas que no es logica de negocio
## 6
la diferencia es que usecase utiliza las acciones de negocio desde la capa aplicacion y service puede existir en diferentes capas
## 7
Se definene repositories para mantener la idea de clean arquitecture: separar todo, que todo sea independiente para lograr el objetivo de mantenibilidad, escalabilidad y testeo
## 8
primero se define una interfaz y su implementacion en la capa de aplicacion, luego, se usa las interfaces del dominio
ventajas: modularidad
## 9 
que hay capas que dependan de otras, por lo cual sea muy complejo actualizar una funcion, porque tendrias que tocar otras capas. dificultad para rastrear errores.
## 10
clean arquitecture facilita la escalabilidad y mantenimiento porque es facil cambiar una funcion, porque todo esta definida en una estructura clara, es faccil actualizar cosas en el codigo porque no necesitas tocar otras capas, solo asegurarte de respetar las reglas de comunicacion entre capas