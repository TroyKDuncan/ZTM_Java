package org.example;

public class Strings {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "goodbye";
        System.out.println(s1.equals(s2));

        // COMMON METHODS
        // length()
        // charAt(int index)
        // indexOf(String)
        // substring(beginning, ending(optional, exclusive))
        // toLowerCase(), toUpperCase()
        // trim() removes leading and trailing whitespace

        // strings are thread-safe because they are immutable
        // assigning a variable a string will always create a new object

        // obj1.equals(obj2) returns boolean

        // StringBuilder
        // data type for mutable text
        // you can use append, insert, delete, replace
        // StringBuffer is thread-safe
    }
}
