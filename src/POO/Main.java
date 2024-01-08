package POO;
public class Main {

    public static void main(String[] args) {

        Human human = new Human("Rick", 65, 70.0);
        Human human1 = new Human("Mikhail", 54, 59.3);

        human.eat();
        human1.drink();
    }
}
