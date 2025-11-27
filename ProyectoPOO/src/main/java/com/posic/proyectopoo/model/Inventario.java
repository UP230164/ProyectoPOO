package com.poo.model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Robot> ArrayRobots;

    Inventario(){
        this.ArrayRobots = new ArrayList<>();
    }

    public List<Robot> getArrayRobots() {
        return ArrayRobots;
    }

    public void setArrayRobots(List<Robot> arrayRobots) {
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
