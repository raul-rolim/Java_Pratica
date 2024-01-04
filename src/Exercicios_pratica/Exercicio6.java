package Exercicios_pratica;
import java.util.*;

public class Exercicio6 {

    public static void main(String[] args) {

//        double num1 = 8, num2 = 9, num3 = 7, num4 = 4, num5 = 5, num6= 6;
//        double media1, media2, mediaMedia;
//
//        media1 = (num1 + num2 + num3) / 3;
//        media2=  (num4 + num5 + num6) / 3;
//        mediaMedia = (media1 + media2) / 2;
//
//        System.out.println("Média 1: " + media1);
//        System.out.println("Média 2: " + media2);
//        System.out.println("Média da Média: " + mediaMedia);

        Scanner scanner = new Scanner(System.in);
        int cod1, cod2;
        double valor1, valor2, quantidade1, quantidade2, IPI, resultado;

        System.out.println("Insira o código da peça 1");
        cod1 = scanner.nextInt();
        System.out.println("Insira o valor da peça 1");
        valor1 = scanner.nextDouble();
        System.out.println("Insira a quantidade da peça 1");
        quantidade1 = scanner.nextDouble();

        System.out.println("Insira o código da peça 2");
        cod2 = scanner.nextInt();
        System.out.println("Insira o valor da peça 2");
        valor2 = scanner.nextDouble();
        System.out.println("Insira quantidade da peça 2");
        quantidade2 = scanner.nextDouble();

        System.out.println("Por fim, Insira a porcentagem do IPI");
        IPI = scanner.nextDouble();

        resultado =(valor1 * quantidade1 + valor2 * quantidade2) * (IPI/100 + 1);
        System.out.println("Valor a ser pago: " + resultado);
        System.out.println("Código da Peça 1: " + cod1 + "\nCódigo da Peça 2: " + cod2);
        scanner.close();
    }
}
