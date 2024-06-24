package OOP;

public class Bird extends Animal {
    Bird () {
        this.setSound("Chirp");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound: " + this.getSound());
    }
}
