package org.example;

public class Interfaces {
    // work like contracts for a class
    // use interface keyword and provide method sigs that are passed to classes upon implementation
    // animal, mammal, bird and prey/predator example

    // to implement multiple interfaces on one class, just separate them by commas after keyword implements
    // public abstract class Fox extends Mammal implements Predator, Prey {}
    // if you are implementing an interface, you must provide bodies and override its abstract methods

    interface example {
        void MyMethod();

        // Default Methods don't have to be overridden, but can if you want
        // They make it so that you don't HAVE to define methods from the interface in the class it's used in
        default void defaultMethod() {
            System.out.println("This is a default method!");
            System.out.println("Private method: " + this.privateMethod());
        }

        // private methods in an interface can only be referenced from within the interface
        // classes that implement an interface cannot use its private methods
        private String privateMethod() {
            return "This is the private method";
        }
    }

    public class MyClass implements example {
        @Override
        public void MyMethod() {
            System.out.println("Do a thing!");
        }
    }

    // when implementing multiple methods that each contain the same method sig, you MUST define the method
}
