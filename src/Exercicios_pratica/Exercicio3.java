package Exercicios_pratica;
import java.util.*;

public class Exercicio3 {

    public static void main(String[] args) {

//        System.out.println("    J      a    v     v    a");
//        System.out.println("    J     a a    v   v    a a");
//        System.out.println("J   J    aaaaa    V V    aaaaa");
//        System.out.println("  JJ    a     a    V    a     a");

//        System.out.println(4.0 * (1-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insira o valor do raio: ");
//        double raio = scanner.nextDouble();
//
//        System.out.println("Perimetro: " + (2 * Math.PI * raio));
//        System.out.println("Area: " + (Math.PI * Math.pow(raio, 2)));

        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, media;
        System.out.println("Insira o primeiro valor: ");
        num1 = scanner.nextDouble();
        System.out.println("Insira o segundo valor: ");
        num2 = scanner.nextDouble();
        System.out.println("Insira o terceiro valor: ");
        num3 = scanner.nextDouble();
        media = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + media);
    }
}
