package oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();

        dog.eat();
        cat.eat();

        // These are accessible by calling the class, not an object
        // Because Dog and Cat are children of Animal, using the static modifier hides the parent's value
        System.out.println(Dog.type);
        System.out.println(Cat.type);
        System.out.println(Animal.type);
    }
}
