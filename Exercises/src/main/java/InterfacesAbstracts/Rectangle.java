package InterfacesAbstracts;

public class Rectangle implements Countable, Drawable {

    @Override
    public void printInfo() {
        System.out.println("Printing info from Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing from Rectangle");
    }
}
