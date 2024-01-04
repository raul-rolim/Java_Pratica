package Exercicio_pratica2;
import java.util.*;

public class Exercicio6 {

    public static void main(String[] args) {

        String[] names = {
                "Mikhail", "Saratov", "Oscar", "Oscar", "Hotel",
                "Romeo", "Romeo", "Alfa", "Bravo", "Bravo", "Charlie",
                "Golf", "Lima", "Lima"
        };
        String search = "";
        String[] duplicated = new String[10];
        int listIndex = 0;

        for(int i = 0; i<names.length; i++) {
            search = names[i];
            for(int j = i+1; j<names.length; j++) {
                if(search == names[j]) {
                    duplicated[listIndex] = search;
                    listIndex++;
                }
            }
        }
        System.out.println("Duplicated: " + Arrays.toString(duplicated));
    }
}
