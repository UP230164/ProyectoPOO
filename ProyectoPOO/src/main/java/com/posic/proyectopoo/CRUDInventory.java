package com.posic.proyectopoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CRUDInventory {

    public static Scene escenaInventarioCRUD() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CRUDInventory.class.getResource("CRUDInventory.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        return scene;
    }
}
