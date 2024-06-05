package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("ORANGE", 1);
        fruitMap.put("GAUVA", 2);
        fruitMap.put("APPLE", 13);
        Iterator<String> fruitElements = fruitMap.keySet().iterator();
        while (fruitElements.hasNext()) {
            if(fruitElements.next().equals("APPLE")) {
                fruitMap.remove(fruitElements.next());
            }
        }
        System.out.println(fruitMap);
    }
}
