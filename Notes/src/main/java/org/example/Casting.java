package org.example;

public class Casting {
    public static void main(String[] args) {
        // for widening type casting, you don't need to explicitly type cast
        int x = 5;
        long y = x;


        // when you are narrowing, you have to typecast explicitly
        long z = 123L;
        int q = (int) z;

        double d = 3.2;
        float f = (float) d;

        // primitives can't have overflow
        // in this example, since -23 is outside of the bounds of a char, it goes to the max value and counts back
        // like in python kinda
        // instead of overflow it just goes to the beginning or end and starts from there
        byte b = -23;
        char c = (char) b;
        System.out.println(c);
        int i = (int) c;
        System.out.println(i);
    }
}
