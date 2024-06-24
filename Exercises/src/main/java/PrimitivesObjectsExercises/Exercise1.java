package PrimitivesObjectsExercises;

class Person {
    String name;
}

class Car {
    String model;
    Person owner;
}

public class Exercise1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Troy";

        Car car = new Car();
        car.model = "Corvette";
        car.owner = person;

        System.out.println("Car model: " + car.model);
        System.out.println("Car owner: " + car.owner.name);
    }
}
