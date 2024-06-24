package OOP;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("woof");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        dog.makeSound();
        bird.makeSound();
        parrot.makeSound();
    }
}
