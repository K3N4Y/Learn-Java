package proyecto.proyecto_uni;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    String[][] preguntas = {
            // Variables
            {"¿Qué palabra clave se usa para declarar una variable en Java?", "TipoDeDato nombre;", "Fácil"},
            {"¿Cuál es el valor por defecto de una variable int en Java?", "0", "Fácil"},
            {"¿Qué diferencia hay entre una variable local y una global?", "La local existe solo dentro de un método, la global tiene alcance más amplio.", "Intermedio"},

            // Metodos de String
            {"¿Qué hace el método .length() en un String?", "Devuelve la longitud del texto.", "Fácil"},
            {"¿Qué devuelve el método .equalsIgnoreCase()?", "Compara dos Strings ignorando mayúsculas y minúsculas.", "Intermedio"},
            {"¿Qué hace el método substring(int inicio, int fin)?", "Devuelve una subcadena desde inicio hasta fin-1.", "Intermedio"},
            {"¿Qué devuelve 'Java'.charAt(2)?", "'v'", "Fácil"},
            {"¿Qué hace el método .replace('a','o')?", "Reemplaza todas las 'a' por 'o'.", "Fácil"},

            // Sentencias de control
            {"¿Qué estructura se usa para decisiones múltiples en Java?", "switch", "Fácil"},
            {"¿Cuál es la diferencia entre if y switch?", "if evalúa condiciones booleanas, switch evalúa un valor fijo.", "Intermedio"},
            {"¿Qué pasa si un case no tiene break en un switch?", "El flujo continúa al siguiente case (fall through).", "Difícil"},

            // Ciclos
            {"¿Qué ciclo se usa cuando se conoce la cantidad de repeticiones?", "for", "Fácil"},
            {"¿Qué diferencia hay entre while y do-while?", "do-while ejecuta al menos una vez, while puede no ejecutarse.", "Intermedio"},
            {"¿Qué hace la instrucción 'continue' dentro de un ciclo?", "Salta a la siguiente iteración.", "Intermedio"},
            {"¿Qué hace la instrucción 'break' en un ciclo?", "Rompe el ciclo actual.", "Fácil"},

            // Manejo de errores
            {"¿Qué palabra se usa para manejar excepciones en Java?", "try-catch", "Fácil"},
            {"¿Qué hace la sección 'finally' en un bloque try-catch-finally?", "Se ejecuta siempre, ocurra o no una excepción.", "Intermedio"},
            {"¿Qué diferencia hay entre Exception y Error en Java?", "Exception se puede manejar, Error representa fallas graves del sistema.", "Difícil"},
            {"¿Cómo se lanza manualmente una excepción?", "throw new Exception(\"mensaje\");", "Difícil"},

            // Matrices y vectores
            {"¿Cómo se declara un arreglo de enteros en Java?", "int[] numeros;", "Fácil"},
            {"¿Cómo se inicializa un arreglo con valores?", "int[] nums = {1,2,3,4};", "Fácil"},
            {"¿Cómo acceder al último elemento de un arreglo llamado 'datos'?", "datos[datos.length - 1];", "Intermedio"},
            {"¿Qué diferencia hay entre una matriz y un vector?", "La matriz tiene dos o más dimensiones, el vector solo una.", "Intermedio"},
            {"¿Cómo se recorre una matriz bidimensional?", "Usando dos bucles for anidados.", "Intermedio"},
            {"¿Qué sucede si intentas acceder a un índice fuera de rango en un arreglo?", "Se lanza una excepción ArrayIndexOutOfBoundsException.", "Difícil"}
    };

     String[] consejos = {
            "Evita usar variables sin inicializar.",
            "Los nombres de clases deben comenzar con mayúscula.",
            "Usa comentarios claros, no redundantes.",
            "Divide tu código en métodos pequeños y reutilizables.",
            "Recuerda cerrar los recursos como archivos o conexiones.",
            "Practica todos los dias, aunque sea un poco.",
            "No temas a equivocarte: cada error es una oprtunidad para aprender.",
            "Lee codigo de otros para mejorar el tuyo.",
            "Usa comentarios para entender tu propio codigo.",
            "No memorices, comprende lo que haces."
    };

    String[] definicionesExtendidas = {
            //Variables
            "Una variable en Java se declara escribiendo primero el tipo de dato (como int, String o double) seguido del nombre de la variable. Esta declaración define qué tipo de información puede almacenar y reserva espacio en memoria.",
            "El valor por defecto de una variable int es 0, siempre y cuando sea un atributo de clase o instancia. Las variables locales no se inicializan automáticamente y deben recibir un valor antes de usarse.",
            "Una variable local solo existe dentro del método o bloque donde se declara y deja de existir al terminar dicho bloque. Una variable global (de instancia o clase) puede ser accedida desde varios métodos dentro de la misma clase y tiene un ciclo de vida más largo.",

            // Métodos de String
            "El método .length() devuelve un número entero que representa cuántos caracteres contiene el String, incluyendo espacios, símbolos y letras.",
            ".equalsIgnoreCase() compara dos textos ignorando si las letras están en mayúsculas o minúsculas, útil cuando el formato no importa.",
            "substring(inicio, fin) genera una subcadena desde el índice inicio hasta el índice fin-1, sin modificar el texto original y creando un nuevo String.",
            "El método charAt(2) devuelve el carácter en la posición 2 del String, considerando que los índices empiezan desde cero. En 'Java', ese carácter es 'v'.",
            "El método replace reemplaza todas las apariciones del carácter 'a' por 'o' y devuelve un nuevo String sin modificar el original.",

            // Sentencias de control
            "La estructura switch permite evaluar un valor específico y elegir entre múltiples casos de forma ordenada, ideal cuando hay varias opciones predefinidas.",
            "El if permite evaluar condiciones lógicas complejas que resultan en verdadero o falso, mientras que switch evalúa un único valor fijo para seleccionar un caso determinado.",
            "Si un case no contiene break, la ejecución continúa en el siguiente case sin detenerse, comportamiento conocido como fall through. Esto puede ser útil o causar errores si no se controla.",

            // Ciclos
            "El ciclo for se usa cuando se sabe de antemano cuántas veces se repetirá una instrucción. Su estructura incluye inicialización, condición y actualización en una sola línea.",
            "El ciclo do-while ejecuta al menos una vez antes de evaluar la condición, mientras que while evalúa la condición primero, pudiendo no ejecutarse nunca si la condición es falsa desde el inicio.",
            "La instrucción continue detiene la iteración actual de un ciclo y salta directamente a la siguiente, ignorando cualquier código restante dentro del ciclo para esa vuelta.",
            "La instrucción break finaliza la ejecución del ciclo inmediatamente, haciendo que el programa continúe con la siguiente instrucción después del ciclo.",


            // Manejo de errores
            "La estructura try-catch permite manejar excepciones. El bloque try contiene el código que podría fallar y el catch especifica cómo reaccionar ante errores específicos.",
            "El bloque finally se ejecuta siempre, sin importar si ocurrió o no una excepción. Es útil para cerrar recursos, liberar memoria o ejecutar tareas críticas.",
            "Exception representa condiciones que pueden ser anticipadas y manejadas por el programa. Error indica fallos graves en la JVM o el sistema que normalmente no deben manejarse con try-catch.",
            "La palabra throw permite lanzar manualmente una excepción. Por ejemplo: throw new Exception(\"mensaje\"); indica que ocurrió un error específico definido por el programador.",

            // Arreglos y matrices
            "Un arreglo de enteros se declara escribiendo int[] seguido del nombre del arreglo, lo cual indica que almacenará múltiples valores enteros.",
            "Un arreglo puede inicializarse directamente especificando sus valores entre llaves, como en int[] nums = {1, 2, 3, 4}; lo que define su tamaño y contenido.",
            "Para acceder al último elemento se usa el índice datos.length - 1, ya que los arreglos empiezan en la posición cero.",
            "Un vector es un arreglo unidimensional donde los datos están en una sola línea. Una matriz tiene dos o más dimensiones, organizando la información en filas y columnas.",
            "Una matriz se recorre usando dos ciclos for anidados: uno para las filas y otro para las columnas, permitiendo acceder a cada elemento.",
            "Acceder a un índice inexistente provoca la excepción ArrayIndexOutOfBoundsException, indicando que se intentó acceder a una posición fuera del límite del arreglo."

    };


    int contador = -1;
    int voltear = -1;

    @FXML
    private Label Texto;
    @FXML
    private Label dificultad;
    @FXML
    private Label consejo;
    @FXML
    private Label definicion;
    @FXML
    private Label extendida;
    @FXML
    private Label progreso;




    @FXML
    public void siguiente() {
        ocultarDefinicion();

        if (contador > 23) {
            contador = -1;
        }

        contador++;
        mostrarPregunta();
        mostrarProgreso();

        if (voltear < 0)
            voltear++;
        }

    @FXML
    public void anterior() {
        ocultarDefinicion();

        if (contador > 0) {
            contador--;
            mostrarPregunta();
            mostrarProgreso();
        }
    }


    //TODO:error al querer voltear la flashcard en el indece -1 aunque se compruebe si es par o impar
    @FXML
    public void voltearCarta() {

        if (contador < 0)
            return;

        if (voltear % 2 == 0) {
            Texto.setText(preguntas[contador][1]);
            voltear++;
            Definicion();
        }
        else{
            Texto.setText(preguntas[contador][0]);
            voltear--;
            ocultarDefinicion();
        }


    }

    public void setConsejo(){
        consejo.setText(consejos[(int) (Math.random() * 11)]);
    }

    public void Definicion(){
        definicion.setText(definicionesExtendidas[contador]);
        extendida.setText("Definicion Extendida");
    }

    public void ocultarDefinicion(){
        definicion.setText("");
        extendida.setText("");
    }

    public void mostrarProgreso(){
        progreso.setText((contador + 1)+ "/" +(preguntas.length));
    }


    private void mostrarPregunta() {
        Texto.setText(preguntas[contador][0]);
        dificultad.setText(preguntas[contador][2]);

        switch (preguntas[contador][2]) {
            case "Fácil":
                dificultad.setStyle("-fx-background-color: #DBFCE7; -fx-alignment: center; -fx-border-width: 1px; -fx-border-color: #3CB371; -fx-padding: 2;");
                break;
            case "Intermedio":
                dificultad.setStyle("-fx-background-color: #FFCC80; -fx-alignment: center; -fx-border-width: 1px; -fx-border-color: #FB8C00; -fx-padding: 2;");
                break;
            case "Difícil":
                dificultad.setStyle("-fx-background-color: #FF6347; -fx-alignment: center; -fx-border-width: 1px; -fx-border-color: #C0392B; -fx-padding: 2;");
                break;
        }
    }

}
