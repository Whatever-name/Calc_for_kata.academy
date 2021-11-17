package Convertation;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int convert(String roman) {
        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);

        Integer result = 0;
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            if (i > 0 && valueMap.get(ch) > valueMap.get(roman.charAt(i - 1))) {
                result += valueMap.get(ch) - 2 * valueMap.get(roman.charAt(i - 1));
            } else {
                result += valueMap.get(ch);
            }
        }
        return result;
    }
}
