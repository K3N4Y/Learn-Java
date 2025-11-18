package proyecto.proyecto_uni;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import proyecto.proyecto_uni.Controller.*;
import javax.swing.*;  // En que parte lo estoy usando?
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            // Cargo el fxml
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("prueba.fxml"));
            // Creo una ecena
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            // Le pongo un titulo al escenario
            stage.setTitle("Aprende Java");
            // Le asigno una ecena
            stage.setScene(scene);
            //Muestro el escenario
            stage.show();
            // Pongo el escenario en pantalla completa
            stage.setFullScreen(true);

            // Importamos el controlador del fxml
            Controller u = fxmlLoader.getController();

            //Mostramos el consejo llamano la funcion
            u.setConsejo();

            // Nos aseguramos que la escena reciba cuando usamos el teclado
            scene.getRoot().requestFocus();

            //TODO:cuando toco un boton con el raton deja de funcionar con el teclado
            
            // Detectar la tecla usamos y llamar una funcion.
            scene.setOnKeyPressed(event -> {
                switch (event.getCode()) {
                    case RIGHT -> u.siguiente();
                    case LEFT -> u.anterior();
                    case SPACE -> u.voltearCarta();
                }
            });

        }

        catch (Exception err){
            //Mostramos una pantalla de error si no se pudo iniciar el programa
            JOptionPane.showMessageDialog(null, "Error no se pudo iniciar la ejecucion","Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
