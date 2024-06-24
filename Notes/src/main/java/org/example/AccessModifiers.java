package org.example;

public class AccessModifiers {
    public static void main(String[] args) {
        // best practice is to keep things as private as possible to keep things at a high level

        // public: accessible from anywhere just needs to be imported

        // private: accessible within the same class, just like C++
        // use getters and setters to access private values
        // private methods can only be called WITHIN the same class

        // protected: accessible inside the package and to its subclasses outside the package
        // default: no modifier, accessible inside the same package, can't be imported outside of the package

        // static: member belongs to the class, not the instance
        // all objects of the given class has the same value for a static value
        // statics can be modified without creating an object of the given type
        // static methods can be used without creating an object as well
    }
}
