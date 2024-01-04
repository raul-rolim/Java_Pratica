package Exercicio_pratica2;
import java.util.*;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] values = new int[3];
        values[0] = 8;
        values[1] = 3;
        values[2] = 4;

        int search;
        System.out.println("Insert a Number: ");
        search = scanner.nextInt();
        for(int i=0;i<values.length;i++) {
            if(search == values[i]) {
                System.out.println("The array contains this number!");
                System.exit(0);
                break;
            }
        }
        System.out.println("The array doesn't contains this number!");

    }
}
