package com.posic.proyectopoo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class CRUDVentas {

    public static Scene escenaVentasCRUD() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CRUDVentas.class.getResource("CRUDVentas.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        return scene;
    }
}
