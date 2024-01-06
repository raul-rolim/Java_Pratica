package Learn1;
import java.util.*;

public class File4_ForEach {

    public static void main(String[] args) {
        final double pi = 3.14159;
//        String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals) {
            System.out.println(i);
        }
    }
}
