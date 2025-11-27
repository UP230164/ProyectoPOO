package com.poo.model;

public class Creador extends PersonaAbstracta {
        private String CodigoCreador;

    Creador(String nombre, int edad, String correo, int telefono, String CodigoCreador){
        super(nombre, edad, correo, telefono);
        this.CodigoCreador = CodigoCreador;    
    }

    public String getCodigoCreador() {
        return CodigoCreador;
    }

    public void setCodigoCreador(String codigoCreador) {
        CodigoCreador = codigoCreador;
    }

    

}
