package com.poo.model;

public class Cliente extends PersonaAbstracta {
        private String RFC;
    
    Cliente(String nombre, int edad, String correo, int telefono, String RFC){
        super(nombre, edad, correo, telefono);
        this.RFC = RFC;    
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String rFC) {
        RFC = rFC;
    }

    

}
