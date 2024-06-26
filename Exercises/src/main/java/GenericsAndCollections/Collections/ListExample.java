package GenericsAndCollections.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Goodbye");
        stringList.add("WHADDUP PARTY PEOPLE??");
        System.out.println(stringList);
    }
}
