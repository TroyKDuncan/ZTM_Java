package PrimitivesObjectsExercises;

public class Exercise2 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before: " + num);
        modifyNumber(num);
        System.out.println("After: " + num);
    }

    public static void modifyNumber(int num) {
        num = num * 2;
    }
}
