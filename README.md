### Aplicaciones Móviles

### Grado en Tecnologías Interactivas (2º cuatr. A)  Universidad Politécnica de Valencia

# Examen de Final Practico  (A)

### Alumno: _______________________ Hora inicio: ______ entrega: ______   Fecha: 30/11/2021

**ADVERTENCIA:** Puede consultarse cualquier tipo de información propia o disponible a través de Internet. No obstante, queda terminantemente prohibido la comunicación con cualquier persona durante la realización del examen. El envío o recepción de correos electrónicos, WhatsApp, compartición de ficheros, uso de redes sociales, etc. supondrá el suspenso automático de la asignatura.

**DESCRIPCIÓN:** Dispones de un máximo de dos horas y diez minutos para realizar el mayor número de pasos y entregar el resultado en una tarea de Poliformat. Las instrucciones de entrega se indican al final:

**0.**	Crea un nuevo proyecto con los siguientes datos (reemplaza usuario_upv por tu usuario): 
```
Project: Phone and Tablet / Empty Activity
Name: Examen A
Package name: com.example.usuario_upv.examentipo_a
Minimum API level: 16 Android 4.1 (Jelly Bean)
```
**1.**	El Layout principal se mostrará de la siguiente forma (en vertical y en horizontal):

![imagen del layout](https://raw.githubusercontent.com/jesus-tomas-girones/Examen_AppMoviles_2021/master/layout.jpg)
       
•	El ancho y alto de los botones ha de ajustarse para abarcar toda la pantalla. 

•	La separación entre los botones y los bordes ha de ser de 16dp.

•	El fondo de los botones ha de ser verde y el tamaño de letra 24sp.

**2.**	En horizontal el layout mostrará los botones + y - a la izquierda en lugar de a la derecha.

**3.**	Al pulsar sobre el botón “1” el texto del botón “=” pasará a contener el texto que ya tenía concatenado un “1”. Ejemplo, si el texto es “=1” pasará a “=11”. Este botón nunca podrá tener más de 10 caracteres.

**4.**	Al girar el teléfono, se mantendrá el texto de este botón.

**5.**	Hemos registrado cuando se ha encendido la luz y cuando se ha apagado en varias habitaciones de una casa.


a) Añade las siguientes constantes a tu aplicación. SEGUNDOS indica el segundo desde el inicio del registro en que se produce el evento. HABITACION representa la habitación donde cambia la iluminación. ENCENDIDA puede ser true si la luz se enciende o false si se apaga.

```
static long    SEGUNDOS[]=  { 1000L, 4000L, 5000L, 6000L, 9000L,12000L,14000L,16000L};
static String  HABITACION[]={"sala","baño","baño","baño","sala","baño","sala","sala"};
static boolean ENCENDIDA[]= {  true,  true, false,  true, false, false,  true, false};
```
b) Crea una clase POJO con tres propiedades según las listas anteriores. Ha de tener un constructor que inicialice todas las propiedades y el método toString(). 

c) Crea un método dentro de la clase que acabas de crear, que reciba como parámetro tres arrays como los que acabas de copiar. El método debe devolver en un diccionario (Map<>), con tantos elementos como tengan los arrays. La clave del diccionario ha de ser un entero. 1 para el primer elemento, 2 para el segundo, y así hasta el número de elementos. Llama a este método y muestra el resultado en el LogCat.

**6.	ALGORITMO:** Calcula cuantos segundos está la luz encendida para cada una de las habitaciones que aparezcan en HABITACIONES. Ha de funcionar, aunque se cambie los arrays de entrada. Muestra el resultado en el log.

**7.**	Al pulsar el botón “3”, se lanzará una actividad con un RecyclerView. Este ha de mostrar toda la información contenida en el diccionario de POJOS creado en el apartado c). Si dispones de tiempo puedes hacer este apartado junto al siguiente. 

**8.**	Busca en Internet dos fotos. Añádelos como recursos al proyecto. Haz que el primero aparezca en cada elemento del RecycerView, menos cuando la habitación sea “baño”, en este caso ha de aparecer el segundo.

**9.**	Al pulsar el botón “4”, se lanzará un servicio en primer plano.

**10.**	Haz que este servicio escuche la posición del dispositivo con un periodo de 5 segundos. La posición del dispositivo será mostrada en el LogCat. Haz que la posición también se muestre en el texto del botón “+”.

### Entrega de la práctica: 

11.	Verifica que todo funciona perfectamente antes de realizar el siguiente punto.

12.	Selecciona la opción Build Bundle APK / Build APK. Así generamos de nuevo el apk.

13.	Selecciona la opción File / Export / Export to Zip file... para guardar el código del proyecto. 

14.	Para entregarla utiliza la opción Tareas del menú de poli[Format]. Adjunta los dos ficheros.

15.	Para facilitar la corrección en el cuadro de texto, que encontrarás al entrar en la entrega de la tarea, indica los ejercicios realizados de la siguiente lista introduciendo una X entre los paréntesis. Añade los comentarios oportunos:

´´´
(_)	1.-Layout
(_)	2.-Recursos alternativos.
(_) 3.-Propiedades vistas
(_)	4.-Guardar estado 
(_)	5.-Colecciones 
(_)	6.-Algoritmo
(_)	7.-RecyclerView
(_)	8.-Imágenes en RecyclerView
(_)	9.- Servicio
(_)	10.-Posicionamiento
´´´
Copia a continuación el código realizado en el punto 6. Envía la tarea.

16.	Ejecuta el proyecto en un terminal o emulador y avisa al profesor para que lo evalúe.
