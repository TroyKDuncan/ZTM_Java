package Exceptions;

public class EmptyStringException extends Exception{
    EmptyStringException () {
        super();
    }
    EmptyStringException (String s) {
        super(s);
    }
    EmptyStringException (Exception e) {
        super();
    }
}
