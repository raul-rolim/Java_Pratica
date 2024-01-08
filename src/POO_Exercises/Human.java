package POO_Exercises;

public class Human {

    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayName() {
        System.out.println("My name is: " + this.name);
    }

    void sayAge() {
        System.out.println("My age is: " + this.age);
    }
}
