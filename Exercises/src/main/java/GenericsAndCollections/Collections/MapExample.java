package GenericsAndCollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Troy", 29);
        myMap.put("Taylor", 26);
        myMap.put("Dad", 69);
        System.out.println(myMap);
    }
}
