package com.java.AlmacenVerduras.Almacen;

public class Lacteo extends Producto{

    private int amount;
    private int proteins;

    public Lacteo(){
        System.out.println("Iniciando constructor");
    }

    public Lacteo(String name, Double price){
        super(name, price);
    }

    public Lacteo(String name, Double price, int amount, int proteins){
        super(name,price);
        this.amount = amount;
        this.proteins = proteins;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }
}
