package Exceptions;

public class CheckedVsUnchecked {
    public static void validateString (String s) throws EmptyStringException {
        if (s.isEmpty()) {
            throw new EmptyStringException("Error: empty string");
        }
    }
}
