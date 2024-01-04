package Exercicios_pratica;
import java.util.*;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Number: ");
        int tabuada = scanner.nextInt();
        for(int i = 0; i<=10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
