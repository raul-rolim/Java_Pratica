package Exercicios_pratica;

public class Exercicio8 {

    public static void main(String[] args) {

        String[] cars = {"Camaro", "Corvette", "Tesla"};

        cars[1] = "Mustang";

        String[] anotherCars = new String[3];
        anotherCars[0] = "Honda";
        anotherCars[1] = "Toyota";
        anotherCars[2] = "Volkswagen";

        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
