package Exceptions;

public class HandlingExceptions {
    public static void main(String[] args) {
        try {
            ThrowingExceptions.ValidateNumber(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
