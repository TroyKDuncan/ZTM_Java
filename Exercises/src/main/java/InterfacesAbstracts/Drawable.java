package InterfacesAbstracts;

public interface Drawable {
    void draw();

    default void erase() {
        System.out.println("Erasing the drawing");
    }

    public default void printInfo () {
        System.out.println("Printing info from Drawable");
    }
}
