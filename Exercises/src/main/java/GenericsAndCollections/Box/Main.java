package GenericsAndCollections.Box;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(1);

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello from inside the box!");

        System.out.println(stringBox.getContent());
        System.out.println(integerBox.getContent());
    }
}
