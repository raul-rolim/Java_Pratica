package Exercicios_pratica;
import java.util.*;

public class Exercicio5 {

    public static void main(String[] args) {

//        int num1=5, num2=8, temp=0;
//
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//
//        System.out.println("Valor1: " + num1);
//        System.out.println("Valor2: " + num2);

        Scanner scanner = new Scanner(System.in);
        int ano, mes, dia, resultado;
        System.out.println("Quantos anos você tem?");
        ano = scanner.nextInt();
        System.out.println("E quantos meses?");
        mes = scanner.nextInt();
        System.out.println("Por fim, quantos dias?");
        dia = scanner.nextInt();
        resultado = (ano * 365 + mes * 30 + dia);
        System.out.println("Você tem: " + resultado + " dias de vida!");
    }
}
