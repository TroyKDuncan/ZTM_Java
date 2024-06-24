package oop;

public class Dog extends Animal {
    public String breed;

    public static String type = "Dog";

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("woof woof");
    }
}
