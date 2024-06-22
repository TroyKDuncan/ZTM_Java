package org.example;

import org.w3c.dom.ls.LSOutput;

public class Enums {
    public static void main(String[] args) {
        // meant for representing a set of constants
        // type safety
        // more readable
        // memory optimization

        enum DaysOfWeek {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

        DaysOfWeek today = DaysOfWeek.SATURDAY;
        // you can use == to compare
        System.out.println(today == DaysOfWeek.SATURDAY);

        // built-in methods: toString(), ordinal(), values()
    }
}
