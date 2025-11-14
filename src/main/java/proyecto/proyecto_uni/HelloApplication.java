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
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("prueba.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            stage.setTitle("Aprende Java");
            stage.setScene(scene);
            stage.show();

            // Importamos el controlador del fxml
            Controller u = fxmlLoader.getController();

            // Nos aseguramos que la escena reciba cuando usamos el teclado
            scene.getRoot().requestFocus();

            //TODO:cuando toco un boton con el teclado deja de funcionar
            
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
