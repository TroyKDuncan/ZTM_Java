package OOP;

public class Animal {
    Animal(String sound) {
        this.sound = sound;
    }

    Animal() {};

    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.getSound());
    }
}
