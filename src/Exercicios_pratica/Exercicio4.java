package Exercicios_pratica;
import java.util.*;

public class Exercicio4 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        double width, height, area, perimeter;
//        System.out.println("Insert the width: ");
//        width = scanner.nextDouble();
//        System.out.println("Insert the height");
//        height = scanner.nextDouble();
//        area = width * height;
//        perimeter = 2 * (height + width);
//        System.out.println("Area: " + area);
//        System.out.println("Perimeter: " + perimeter);
        int stars = 0;
        String flag = "";
        for(int i = 0; i<=14; i++) {

            while(stars < 8) {
                for(int j = 0; j<=5; j++) {
                    flag = flag + "*";
                }
                stars++;
                for(int k = 0; k<=30; k++){
                    flag = flag + "=";
                }
                flag = flag + "\n";
                flag = flag + " ";
                for(int l = 0; l<=4; l++) {
                    flag = flag + "*";
                }
                stars++;
                flag = flag + " ";
                for(int k = 0; k<=29; k++){
                    flag = flag + "=";
                }
                flag = flag + "\n";
            }
            for(int m = 0; m<=35; m++){
                flag = flag + "=";
            }
            flag = flag + "\n";
        }
        System.out.println(flag);
    }
}
