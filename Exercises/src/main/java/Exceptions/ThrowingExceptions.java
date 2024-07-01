package Exceptions;

public class ThrowingExceptions {
    static void ValidateNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
    }
}
