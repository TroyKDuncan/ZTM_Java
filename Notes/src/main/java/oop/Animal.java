package oop;

public class Animal {
    private String name;
    private int age;
    private int numEyes;
    public static String type = "Animal";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
    }

    public int getNumEyes() {
        return numEyes;
    }

    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
}
