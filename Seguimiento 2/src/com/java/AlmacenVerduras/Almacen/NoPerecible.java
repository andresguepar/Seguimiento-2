package com.java.AlmacenVerduras.Almacen;

public class NoPerecible extends Producto{
    private int content;
    private int calories;

    public NoPerecible(){
        System.out.println("Iniciando constructor");
    }

    public NoPerecible(String name, Double price){
        super(name, price);
    }

    public NoPerecible(String name, Double price, int content, int calories){
        super(name,price);
        this.content = content;
        this.calories = calories;
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}
