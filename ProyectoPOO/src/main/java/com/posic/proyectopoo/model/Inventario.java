package com.posic.proyectopoo.model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private ObservableList<Robot> ArrayRobots;

    public Inventario(){
        this.ArrayRobots = FXCollections.observableArrayList();
    }

    public ObservableList<Robot> getArrayRobots() {
        return ArrayRobots;
    }

    public void setArrayRobots(ObservableList<Robot> arrayRobots) {
        ArrayRobots = arrayRobots;
    }

    public void agregarRobot(Robot robot){
        getArrayRobots().add(robot);
    }

    public void eliminarRobot(Robot robot){
        getArrayRobots().remove(robot);
    }

    public void mostrarInventario(){
        for (Robot i : getArrayRobots()){
            i.mostrarDatos();
        }
    }

}
