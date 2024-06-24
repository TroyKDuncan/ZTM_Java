package InterfacesAbstracts;

public interface Countable {
    public default void printInfo () {
        System.out.println("Printing info from Countable");
    }
}
