package proyecto.proyecto_uni;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            stage.setTitle("Aprende Java");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception err){
            JOptionPane.showMessageDialog(null, "Error no se pudo iniciar la ejecucion","Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
