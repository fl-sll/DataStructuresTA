package Week1;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name1, String breed1, int age1) {
        name = name1;
        breed = breed1;
        age = age1;
    }

    int calcYoB() {
        return 2023 - age;
    }

    void greet() {
        System.out.println("Hello my name is " + name + " and i'm a " + race);
    }

    public static void main(String[] args) {
        Dog arish = new Dog("arish", "Bulldog", 45);
        arish.greet();
        System.out.println("I was born in " + arish.calcYoB());
    }
}
