package com.java.AlmacenVerduras.Almacen;

public class Limpieza extends Producto{
    private String components;
    private Double liters;

    public Limpieza(){
        System.out.println("Iniciando constructor");
    }

    public Limpieza(String name, Double price){
        super(name, price);
    }

    public Limpieza(String name, Double price, String components, Double liters){
        super(name,price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public Double getLiters() {
        return liters;
    }

    public void setLiters(Double liters) {
        this.liters = liters;
    }
}
