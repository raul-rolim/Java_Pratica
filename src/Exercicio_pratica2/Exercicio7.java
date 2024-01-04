package Exercicio_pratica2;
import java.util.*;

public class Exercicio7 {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] values = new int[3][3];

        for(int i = 0; i<values.length; i++) {
            for(int j=0; j<values[i].length; j++) {
                values[i][j] = random.nextInt(10) + 1;
            }
        }
        System.out.println("2d Array values: " + Arrays.deepToString(values));
    }
}
