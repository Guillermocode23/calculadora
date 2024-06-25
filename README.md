# Calculadora en java 


Con 4 clases se creo una calculadora funcional usando eclipse atraves del lenguaje java en este repositorio
 en calculator---- src -------calculator tenemos el codigo del programa 
en este repositorio se incluye la documentacion hecha por eclipse ide y al descargarse la carpeta funciona desde el index1.


 ## Descripción General

La Calculadora es una aplicación diseñada para realizar operaciones aritméticas básicas y avanzadas. Ofrece una interfaz de usuario intuitiva y sencilla, permitiendo a los usuarios llevar a cabo cálculos de manera eficiente y precisa.

Características
Operaciones Básicas: Suma, resta, multiplicación y división.
Operaciones Avanzadas: raíces cuadradas y jerarquia de operaciones.
Historial de Cálculos: Registro de las operaciones realizadas durante la sesión.
Interfaz de Usuario: Diseño limpio y accesible para una fácil navegación.


## Authors

- Torres Luna Guillermo Enrique
- Hernández Urbina Ian Saúl
- Sanchez Alcala Javier Alejandro
- Suarez Perez Alejandro.

## Interfaz

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
|Color base | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) black |
|Boton  | ![#fe0000](https://via.placeholder.com/10/fe0000?text=+) #fe0000 |
|Color font | ![White](https://via.placeholder.com/10/ffffff?text=+) #ffffff |
|Font |  Arial bold  11 |

### Declaración de la Clase

La clase `interfaz` extiende `JFrame`, permitiendo que funcione como una ventana en una aplicación GUI. Esto le otorga las propiedades y métodos de `JFrame`.

### Variables de Instancia

- `operador`: Una cadena que almacena el operador matemático (por ejemplo, `+`, `-`, `x`, `/`).
- `serialVersionUID`: Un identificador único para la clase, utilizado en la serialización.
- `contentPane`: Un `JPanel` que sirve como el panel principal de contenido del marco.

### Constructor

El constructor inicializa la ventana y sus componentes.

### Propiedades de la Ventana

- `setAlwaysOnTop(true)`: Hace que la ventana siempre esté encima de otras ventanas.
- `setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE)`: Configura el tipo de exclusión modal.
- `setType(Type.UTILITY)`: Establece el tipo de ventana como de utilidad.
- `setResizable(false)`: Impide que la ventana sea redimensionada.
- `setForeground(new Color(255, 128, 192))`: Establece el color de primer plano.
- `setFont(new Font("French Script MT", Font.PLAIN, 16))`: Configura la fuente utilizada.
- `setTitle("calculadora belica")`: Establece el título de la ventana.
- `setBackground(new Color(255, 128, 192))`: Configura el color de fondo.
- `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`: Define la operación predeterminada al cerrar la ventana.
- `setBounds(100, 100, 298, 495)`: Establece el tamaño y posición de la ventana.

### Panel de Contenido

Se inicializa el `contentPane` con un fondo negro y un diseño nulo para posicionamiento absoluto.

### Componentes y sus Propiedades

#### Botón de Borrar (Borrar)

- Se crea un botón con la etiqueta "C".
- Se configuran sus propiedades como el icono, color de fondo y texto, fuente y borde.
- Se añade un `ActionListener` para limpiar la operación y el resultado cuando se presiona.

### Etiquetas para la Operación y el Resultado

- `operacion`: Una etiqueta para mostrar la operación actual.
- `resultado`: Una etiqueta para mostrar el resultado calculado.

#### Botones de Operaciones Matemáticas

Se crean botones para cada operación matemática (`+`, `-`, `x`, `/`, `√`). Cada botón tiene propiedades configuradas como el icono, color de texto y fondo, fuente y borde. Se añaden `ActionListener` para actualizar la operación mostrada cuando se presiona un botón.

#### Botones de Números

Se crean botones para los números del 0 al 9. Cada botón tiene propiedades configuradas y `ActionListener` para actualizar la operación mostrada con el número correspondiente.

#### Botón de Punto Decimal

Se crea un botón para el punto decimal con sus propiedades configuradas y un `ActionListener` para actualizar la operación mostrada.

#### Botón de Igual

Se crea un botón para el símbolo igual (`=`) con sus propiedades configuradas. Se añade un `ActionListener` para evaluar la expresión matemática cuando se presiona el botón de igual, y mostrar el resultado en la etiqueta de resultado.

#### Botón de Borrar un Caracter

Se crea un botón adicional para borrar un carácter con sus propiedades configuradas y un `ActionListener` para eliminar el último carácter de la operación mostrada.

Este es un resumen de las partes principales del código, detallando la funcionalidad y configuración de cada componente en la interfaz gráfica de la calculadora.




## Requisitos 

Para ejecutarlo necesitas el jdk 21 o a su vez el nativo de eclipse. Para su desarrollo se utiizo eclipse jundo con el plugn windows builder 

### Requisitos del Sistema

Sistema Operativo: Windows, macOS, Linux.
Memoria RAM: 1 GB mínimo.
Espacio en Disco: 50 MB mínimo.
Software Adicional: Java Runtime Environment (para versiones basadas en Java). 


## Ejemplo de uso con clase inicio

Esto hace visible la aplicacion 

```java
public class inicio {

		public static void main(String[] args) {
		    interfaz frame = new interfaz();
		    frame.setVisible(true);
		    
		    
}}
```


## Running Tests

To run tests, run the following command

```bash
  npm run test
```


## Tecnologia de la aplicacion

**Interfaz:** Java swing , windows builder 




## Ejecutar en local con git hub

Clone the project

```bash
  git clone https://link-to-project
```

Go to the project directory

```bash
  cd my-project
```

Install dependencies

```bash
  npm install
```

Start the server

```bash
  npm run start
```


## Clase calculadora
Este código Java define una clase llamada calculadora que puede evaluar expresiones matemáticas y mantener un historial de los cálculos realizados. A continuación, se explica en detalle cada parte del código:

Atributos de la Clase
historial: Una lista que almacena los números y operadores utilizados en las expresiones evaluadas. Se utiliza para rastrear y mantener un registro de las operaciones.
Métodos Principales
evaluarExpresion
Este es el método principal para evaluar una expresión matemática. Se encarga de interpretar y calcular el resultado de la expresión proporcionada.

Validación de la Expresión:

Verifica si la expresión es nula o está vacía. Si lo es, lanza una excepción IllegalArgumentException.
Inicialización de Pilas:

numeros: Una pila para almacenar los números de la expresión.
operadores: Una pila para almacenar los operadores de la expresión.
numero: Un StringBuilder para construir los números a partir de los caracteres de la expresión.
Iteración sobre la Expresión:

Itera sobre cada carácter de la expresión.
Ignora los espacios en blanco.
Si el carácter es un dígito o un punto decimal, lo agrega al StringBuilder numero.
Si encuentra un operador (+, -, x, /, √), primero agrega el número construido (si existe) a la pila numeros y luego maneja la precedencia de los operadores antes de agregar el operador actual a la pila operadores.
Maneja paréntesis abriendo y cerrando para evaluar subexpresiones.
Finalización de la Evaluación:

Agrega el último número construido a la pila numeros.
Realiza las operaciones restantes en las pilas de numeros y operadores.
Resultado Final:

El resultado final queda en la cima de la pila numeros.
tienePrecedencia
Este método determina si un operador tiene mayor precedencia que otro. Se utiliza para decidir cuándo realizar una operación mientras se procesa la expresión.

realizarOperacion
Este método ejecuta las operaciones aritméticas utilizando los números y operadores de las pilas.

Operaciones Soportadas:
+: Suma.
-: Resta.
x: Multiplicación.
/: División (verifica la división por cero).
√: Raíz cuadrada (verifica si el número es no negativo).
borrarUltimoElemento
Este método permite borrar el último elemento del historial, ya sea un número o un operador.

Verificación del Historial:

Si el historial está vacío, lanza una excepción IllegalStateException.
Remover el Último Elemento:

Remueve el último elemento del historial.
Si es un número, lo remueve de la pila numeros.
Si es un operador, lo remueve de la pila operadores.

## Screenshots
![Captura de la Calculadora](https://github.com/Guillermocode23/calculadora/blob/master/Capturacalc.JPG)

## Diagragrama de clases
 ![Diagrama del Proyecto](https://github.com/Guillermocode23/calculadora/blob/master/diagrama.png)
