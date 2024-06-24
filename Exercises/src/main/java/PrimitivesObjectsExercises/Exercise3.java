package PrimitivesObjectsExercises;

class Person1 {
    String name;
    int age;
}

public class Exercise3 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.age = 29;
        person.name = "Troy";

        System.out.println("Before: " + person.name + ", " + person.age);
        modifyPerson(person);
        System.out.println("After: " + person.name + ", " + person.age);
    }

    public static void modifyPerson(Person1 a) {
        a.name = "Not what you had before";
        a.age += 4;
    }
}
