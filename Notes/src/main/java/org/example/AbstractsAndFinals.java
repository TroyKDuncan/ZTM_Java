package org.example;

public abstract class AbstractsAndFinals {
    // abstract classes are used as base classes that are too vague to instantiate
    // example: talking about your animal is a little too vague, but dog would be more useful
    // however, using an abstract class of animal can provide a great base for other classes that can inherit
    // abstract classes can declare abstract methods that MUST be defined within inheriting classes
    abstract void MyMethod();

    // final keyword means a class can't be extended/can't be a parent class
    // a final variable means its value can only be assigned once/is immutable
}
