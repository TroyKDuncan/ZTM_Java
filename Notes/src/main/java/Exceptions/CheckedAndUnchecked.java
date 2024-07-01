package Exceptions;

public class CheckedAndUnchecked {
    public static void main(String[] args) {
        // checked need to be handled and happen at compile time
        // unchecked happen at runtime

        // throwing exceptions should only be used if you can't use try/catch because it still crashes your
        // program.

        // try/catch works the same as in python try/except
        // you have to use individual catch statements for each exception, instead of listing them like in python

        // you can create custom exception classes by extending Exception for checked and runtimeexception for
        // unchecked exceptions
        // you should always have at least 3 constructors: one that accepts no input, one that accepts a string,
        // and one that accepts another exception
        // extend the best matching exception, and don't overuse custom exceptions
    }
}
