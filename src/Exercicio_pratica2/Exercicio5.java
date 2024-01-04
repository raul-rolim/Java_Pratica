package Exercicio_pratica2;
import java.util.Arrays;

public class Exercicio5 {

    public static void main(String[] args) {

//        int[] first = {10 , 20, 30, 42, 123, 234, 90};
//        int[] second = new int[first.length];
//
//        System.out.println("Before\nFirst Array: " + Arrays.toString(first));
//        System.out.println("Second: " + Arrays.toString(second));
//
//        for(int i = 0; i<first.length; i++) {
//            second[i] = first[i];
//        }
//        System.out.println("After\nSecond Array: " + Arrays.toString(second));

//        int[] values = {123, 3412, 23, 41, 451 , 5124, 213, 23412, 762, 243};
//        int max = 0, min = 999;
//        for(int i = 0; i<values.length; i++) {
//            if(values[i] > max) {
//                max = values[i];
//            }
//            if(values[i] < min) {
//                min = values[i];
//            }
//        }
//
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int increment = 0, temp = 0;
        for(int i = values.length - 1; i >= values.length / 2; i--) {
            temp = values[increment];
            values[increment] = values[i];
            values[i] = temp;
            increment++;
        }
        System.out.println("Array: " + Arrays.toString(values));
    }
}
