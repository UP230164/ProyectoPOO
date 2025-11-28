package com.posic.proyectopoo;

import com.posic.proyectopoo.ControladorPrincipal;
import com.posic.proyectopoo.model.Inventario;
import com.posic.proyectopoo.model.Robot;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class CRUDInventory {

    @FXML
    private  TableView<Robot> TablaInventario;

    public void cargarDatos(){
        Inventario inventario = new Inventario();
        inventario.agregarRobot(new Robot("000006", "Superman", "Hyundai", "CRE001", "Dual", "Choque", "Version 2", 100.23));
        inventario.agregarRobot(new Robot("000007", "Superman", "Hyundai", "CRE001", "Dual", "Choque", "Version 2", 100.23));
        inventario.agregarRobot(new Robot("000008", "Superman", "Hyundai", "CRE001", "Dual", "Choque", "Version 2", 100.23));
        inventario.mostrarInventario();
        TablaInventario.setItems(inventario.getArrayRobots());
    }

    public static Scene escenaInventarioCRUD() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CRUDInventory.class.getResource("CRUDInventory.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        CRUDInventory controller = fxmlLoader.getController();
        controller.cargarDatos();

        return scene;
    }
    @FXML
    protected void MenuPrincipal() throws IOException {
        Stage stage = ControladorPrincipal.getStage();
        stage.setScene(ControladorPrincipal.getPrinciScene());
        stage.setTitle("Menú Principal");
        stage.show();
    }
}
