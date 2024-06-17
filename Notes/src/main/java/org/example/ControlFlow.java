package org.example;

public class ControlFlow {
    public static void main(String[] args) {
        // if-else if-else syntax identical to C

        // switch statements are the same too with fall through

        // while loops and do-while loops are the same as C

        // for loops have same syntax as C

        // foreach loop, or enhanced for loop works similarly to python for loop
        // no access to indeces
        String[] names = {"Billy","Bob","Josh"};

        // for every string name in names, do the following
        for (String name : names) {
            System.out.println(name);
        }

        // break and continue work the same as C and python
        // use them as little as possible
    }
}
