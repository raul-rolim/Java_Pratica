import javax.swing.*;

public class pratica1 {
    public static void main(String[] args) {
//        int friends = 10;
//        friends = friends % 6;
//        System.out.println(friends);

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Age " + age
        );
    }
}
