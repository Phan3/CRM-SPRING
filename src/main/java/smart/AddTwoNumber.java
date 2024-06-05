package smart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddTwoNumber {

    public int romanToInt(String s) {
        Map<String, Integer> mapValue = new HashMap<>();
        mapValue.put("I", 1);
        mapValue.put("V", 5);
        mapValue.put("X", 10);
        mapValue.put("L", 50);
        mapValue.put("C", 100);
        mapValue.put("D", 500);
        mapValue.put("M", 1000);

        Map<String, Integer> mapOrder = new HashMap<>();
        mapOrder.put("I", 1);
        mapOrder.put("V", 2);
        mapOrder.put("X", 3);
        mapOrder.put("L", 4);
        mapOrder.put("C", 5);
        mapOrder.put("D", 6);
        mapOrder.put("M", 7);

        char[] sChars = s.toCharArray();
        List<String> list = new ArrayList<>();
        int index = 0;
        while (index == sChars.length) {

        }
        for(int i = 0; i< sChars.length -1; i++) {
            StringBuilder str = new StringBuilder(sChars[i]);
            if(mapValue.get(String.valueOf(sChars[i])) <= mapValue.get(String.valueOf(sChars[i++]))) {
                str.append(sChars[i++]);
            }
        }
        return 1;

    }
}
