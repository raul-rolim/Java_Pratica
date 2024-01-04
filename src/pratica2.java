import java.util.Scanner;

public class pratica2 {

    public static void main(String[] args) {

        double x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        z = (Math.floor(z*100) / 100);
        System.out.println(z);

        scanner.close();
    }
}
