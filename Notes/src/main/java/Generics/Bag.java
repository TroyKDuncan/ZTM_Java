package Generics;

public class Bag<T>{
    // the T is replaced with a type upon instantiation
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
