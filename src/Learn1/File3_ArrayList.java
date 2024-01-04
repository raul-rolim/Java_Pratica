package Learn1;

import java.util.*;

public class File3_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot Dog");

        for(int i = 0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
