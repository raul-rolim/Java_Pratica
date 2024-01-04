package Exercicios_pratica;
import java.util.*;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double salUsu, salMin;
//
//        System.out.println("Insira o valor do salário mínimo");
//        salMin = scanner.nextDouble();
//        System.out.println("Insira o valor do seu salário");
//        salUsu = scanner.nextDouble();
//
//        System.out.println("Você ganha " + (Math.ceil((salUsu/salMin) * 100) / 100)
//                + " salários mínimos");

        System.out.println("Insira um número inteiro");
        int num1 = scanner.nextInt();
        System.out.println("Número: " + num1);
        System.out.println("Antecessor: " + (num1 - 1));
        System.out.println("Sucessor: " + (num1 + 1));
        scanner.close();
    }
}
