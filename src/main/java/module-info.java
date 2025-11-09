module proyecto.proyecto_uni {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens proyecto.proyecto_uni to javafx.fxml;
    exports proyecto.proyecto_uni;
}