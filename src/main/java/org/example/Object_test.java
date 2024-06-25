package org.example;

public class Object_test {

    public static void main(String[] args) {

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";

        String audiInfo = audi.brand + " " + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelsColor
                + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);

        System.out.printf("--------------------");

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "X4";
        bmw.doors = 4;
        bmw.carColor = "BMW";
        bmw.wheelsColor = "BMW";
        bmw.tiresColor = "BMW";
        String bmwInfo = bmw.brand + " " + bmw.model + " " + bmw.doors + " " + bmw.carColor + " " + bmw.wheelsColor;
        System.out.println(bmwInfo);
        System.out.println("Tym razem wyvrales ten samochód: ");

        Car bmwCopy = audi;
        bmwCopy.brand = "BMWWWWW";
        System.out.println(bmwInfo);
        System.out.println(bmwCopy);
        String bmwInfoCopy = bmwCopy.brand + " " + bmwCopy.model + " " + bmwCopy.doors + " " + bmwCopy.carColor + " " + bmwCopy.wheelsColor;
        System.out.println(bmwInfoCopy);

        System.out.println("--------------------");



    }
}
