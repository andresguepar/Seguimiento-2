package com.java.AlmacenVerduras.Almacen;

public class Fruta extends Producto{
    private Double weigh;
    private String color;

    public Fruta(){
        System.out.println("Iniciando constructor");
    }

    public Fruta(String name, Double price){
        super(name, price);
    }

    public Fruta(String name, Double price, Double weigh, String color){
      super(name,price);
      this.weigh = weigh;
      this.color = color;
    }

    public Double getWeigh() {
        return weigh;
    }

    public void setWeigh(Double weigh) {
        this.weigh = weigh;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
