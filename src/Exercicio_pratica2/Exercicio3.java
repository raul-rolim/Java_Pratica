package Exercicio_pratica2;
import java.util.*;

public class Exercicio3 {

    public static void main(String[] args) {

        int[] values = new int[10];
        Scanner scanner = new Scanner(System.in);

        values[0] = 9;
        values[1] = 85;
        values[2] = 22;
        values[3] = 357;
        values[4] = 7;
        values[5] = 231;
        values[6] = 157;
        values[7] = 64;
        values[8] = 42;
        values[9] = 213;

        boolean not_found = true;
        while (not_found) {
            System.out.println("Input a Number: ");
            int number = 0;
            number = scanner.nextInt();
            for (int i = 0; i < values.length; i++) {
                if(number == values[i]) {
                    System.out.println("This number is contained in the Array");
                    System.out.println("Index: " + i);
                    break;
                }
            }
        }
    }
}