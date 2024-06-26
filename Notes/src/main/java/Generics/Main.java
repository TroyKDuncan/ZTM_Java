package Generics;

public class Main {
    public static void main(String[] args) {
        Bag<Laptop> bag = new Bag<>();
        Laptop macbook = new Laptop();

        macbook.setModel("MacBook");
        bag.setContent(macbook);

    }
}
