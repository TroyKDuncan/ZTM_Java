package org.example;

public class Arrays {
    public static void main(String[] args) {
        // how to declare an array in Java
        int[] nrs = {1,2,3,4,5};
        String[] fruits = {"apple","orange","banana"};

        // indexing works the same as python and C
        int x = nrs[0];

        // length must be decided upon creation
        // this sets all of the values to default, so {0,0,0,0,0,0}
        // values can be updated without assigning a new variable
        int[] nums = new int[6];
        nums[0] = 2;
    }
}
