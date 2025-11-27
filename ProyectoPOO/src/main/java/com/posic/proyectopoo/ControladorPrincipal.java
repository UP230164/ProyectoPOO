package com.posic.proyectopoo;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorPrincipal {

    private static Stage princiStage;
    private static Scene princiScene;

    public Stage getStage() {
        return princiStage;
    }

    public static void setStage(Stage stage) {
        ControladorPrincipal.princiStage = stage;
    }

    public static Scene getPrinciScene() {
        return princiScene;
    }

    public static void setPrinciScene(Scene princiscene) {
        ControladorPrincipal.princiScene = princiscene;
    }

    @FXML
    protected void CRUDInventario() throws IOException {
        Stage stage = getStage();
        stage.setScene(CRUDInventory.escenaInventarioCRUD());
        stage.setTitle("Inventario CRUD");
        stage.show();
    }
    @FXML
    protected void CRUDVentas() throws IOException {
        Stage stage = getStage();
        stage.setScene(CRUDVentas.escenaVentasCRUD());
        stage.setTitle("Ventas CRUD");
        stage.show();
    }
    @FXML
    protected void MenuPrincipal() throws IOException {
        Stage stage = getStage();
        stage.setScene(getPrinciScene());
        stage.setTitle("Menú Principal");
        stage.show();
    }

}
