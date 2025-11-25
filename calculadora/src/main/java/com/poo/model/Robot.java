package com.poo.model;

public class Robot {
    private String NoSerial;
    private String Nombre;
    private String Marca;
    private String CodigoCreador;
    private String TipoJuego;
    private String TipoAtaque;
    private String Modelo;
    private int Precio;

    Robot(String NoSerial, String Nombre, String Marca, String CodigoCreador, String TipoJuego, String TipoAtaque, String Modelo, int Precio){
        this.NoSerial = NoSerial;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.CodigoCreador = CodigoCreador;
        this.TipoJuego = TipoJuego;
        this.TipoAtaque = TipoAtaque;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }

    public String getNoSerial() {
        return NoSerial;
    }

    public void setNoSerial(String noSerial) {
        NoSerial = noSerial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCodigoCreador() {
        return CodigoCreador;
    }

    public void setCodigoCreador(String codigoCreador) {
        CodigoCreador = codigoCreador;
    }

    public String getTipoJuego() {
        return TipoJuego;
    }

    public void setTipoJuego(String tipoJuego) {
        TipoJuego = tipoJuego;
    }

    public String getTipoAtaque() {
        return TipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        TipoAtaque = tipoAtaque;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("NoSerial: " + getNoSerial());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("CodigoCreador: " + getCodigoCreador());
        System.out.println("TipoJuego: " + getTipoJuego());
        System.out.println("TipoAtaque: " + getTipoAtaque());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
    }

}
