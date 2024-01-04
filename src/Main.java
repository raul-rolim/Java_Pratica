import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        long x;
//        x= 12336125254761254L;
//        float y = 3.21f;
//        double z = 411.231;
//        System.out.println(z);
//
//        boolean test = true;
//        String x = "water";
//        String y = "Kool-Aid";
//        String change = "";
//        change = x;
//        x = y;
//        y = change;
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Food: " + food);

    }
}