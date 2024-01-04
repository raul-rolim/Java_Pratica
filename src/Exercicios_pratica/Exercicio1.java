package Exercicios_pratica;
import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {

//        System.out.println("Hello");
//        System.out.println("Mikhail Saratov");
//        int num1 = 74;
//        int num2 = 36;
//        System.out.println(num1 + num2);
//        int num1 = 50;
//        System.out.println(num1 / 3);

//        System.out.println("Expression 1: " + (-5 + 8 * 6));
//        System.out.println("Expression 2: " + ((55 + 9) % 9));
//        System.out.println("Expression 3: " + (20 + (-3 * 5) / 8));
//        System.out.println("Expression 4: " + (5 + 15 / 3 * 2 - 8 % 3));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Agora insira o segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.println("Resultado 1: " + (valor1 + valor2));
        System.out.println("Resultado 2: " + (valor1 - valor2));
        System.out.println("Resultado 3: " + (valor1 * valor2));
        System.out.println("Resultado 4: " + (valor1 / valor2));
        System.out.println("Resultado 5: " + (valor1 % valor2));

    }
}
