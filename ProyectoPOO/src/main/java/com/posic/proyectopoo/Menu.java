package com.posic.proyectopoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Establecemos la escena Menú y la mostramos
        FXMLLoader fxmlLoader = new FXMLLoader(Menu.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.setTitle("Menú Principal");

        // Envíamos el escenario al controlador que cambiará las escenas
        ControladorPrincipal.setStage(stage);

        // Enviamos la escena al controlador para no perderla
        ControladorPrincipal.setPrinciScene(scene);

        // Lanzamos el stage
        stage.show();
    }
}
