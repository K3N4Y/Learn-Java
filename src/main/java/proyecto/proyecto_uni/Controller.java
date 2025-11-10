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

    int contador = -1;
    int voltear = -1;

    @FXML
    private Label Texto;
    @FXML
    private Label dificultad;


    @FXML
    private void siguiente() {
        if (contador < preguntas.length - 1) {
            contador++;
            mostrarPregunta();
        }
        if (voltear < 0)
            voltear++;
    }

    @FXML
    private void anterior() {
        if (contador > 0) {
            contador--;
            mostrarPregunta();
        }
    }


    //TODO:error al querer voltear la flashcard en el indece -1 aunque se compruebe si es par o impar
    @FXML
    private void voltear() {

        if (contador < 0)
            return;

        if (voltear % 2 == 0) {
            Texto.setText(preguntas[contador][1]);
            voltear++;
        }
        else{
            Texto.setText(preguntas[contador][0]);
            voltear--;
        }


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