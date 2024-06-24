package org.example;

import org.w3c.dom.ls.LSOutput;

public class Enums {
    public static void main(String[] args) {
        // meant for representing a set of constants
        // type safety
        // more readable
        // memory optimization
        // you can use == to compare

        enum DaysOfWeek {
            MONDAY("Monday", 1),
            TUESDAY("Tuesday", 2),
            WEDNESDAY("Wednesday", 3),
            THURSDAY("Thursday", 4),
            FRIDAY("Friday", 5),
            SATURDAY("Saturday", 6),
            SUNDAY("Sunday", 7);

            private String fullName;
            private int dayNum;

            DaysOfWeek(String fullName, int dayNum) {
                this.fullName = fullName;
                this.dayNum = dayNum;
            }

            public String getFullName() {
                return fullName;
            }

            public int getDayNum() {
                return dayNum;
            }
        }

        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day.getFullName() + " " + day.getDayNum());
        }
        // built-in methods: toString(), ordinal(), values()
    }
}
