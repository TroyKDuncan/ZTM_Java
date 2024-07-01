package Exceptions;

public class CustomCheckedException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            validateAge(-1);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            validateAge(121);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
