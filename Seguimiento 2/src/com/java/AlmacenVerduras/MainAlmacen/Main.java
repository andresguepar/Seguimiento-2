package com.java.AlmacenVerduras.MainAlmacen;


import com.java.AlmacenVerduras.Almacen.*;

public class Main {
    public static void main(String[] args) {

        Producto[] productos = new Producto[8];
        productos[0] = new Fruta("Watermelon", 250.0, 2.0, "Green");
        productos[1] = new Fruta("Watermelon", 250.0, 2.0, "Green");

        productos[2] = new Lacteo("Yogurt", 150.0, 100, 500);
        productos[3] = new Lacteo("Yogurt", 150.0, 100, 500);

        productos[4] = new Limpieza("Liquid Soap", 100.0, "Oil, Caustic Solution, Water", 1.5);
        productos[5] = new Limpieza("Liquid Soap", 100.0, "Oil, Caustic Solution, Water", 1.5);

        productos[6] = new NoPerecible("Beans", 90.0, 500, 71);
        productos[7] = new NoPerecible("Beans", 90.0, 500, 71);


        for (Producto prod : productos) {

            System.out.println("===========================");
            System.out.println("ヽ(=^･ω･^=)丿" + prod.getClass().getSimpleName() + "ヽ(=^･ω･^=)丿");
            System.out.println("===========================");
            System.out.println("Name: " + prod.getName() + " - " + "Price: $" + prod.getPrice());

            if (prod instanceof Fruta) {
                System.out.println("Weight: " + ((Fruta) prod).getWeigh() + " Kg");
                System.out.println("Color: " + ((Fruta) prod).getColor());
            }
            if (prod instanceof Lacteo) {
                System.out.println("Amount: " + ((Lacteo) prod).getAmount() + " L");
                System.out.println("Proteins: " + ((Lacteo) prod).getProteins());
            }
            if (prod instanceof Limpieza) {
                System.out.println("Components: " + ((Limpieza) prod).getComponents());
                System.out.println("Litters: " + ((Limpieza) prod).getLiters() + " L");
            }
            if (prod instanceof NoPerecible) {
                System.out.println("Content: " + ((NoPerecible) prod).getContent() + " gr");
                System.out.println("Calories: " + ((NoPerecible) prod).getCalories());
            }
        }
    }
}
