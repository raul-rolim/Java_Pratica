package Exercicio_pratica2;
import java.util.*;

public class Exercicio8 {

    public static void main(String[] args) {
        feast("chickadee", "chocolate cake");

    }

    public static boolean feast(String beast, String dish) {
        char beastFirst, beastLast;
        beastFirst = beast.charAt(0);
        beastLast = beast.charAt(beast.length()-1);
        if((dish.charAt(0) == beastFirst) && (dish.charAt(dish.length()-1) == beastLast)) {

            return true;
        }
        else {
            return false;
        }
    }
}
