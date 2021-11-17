package Convertation;

import java.util.TreeMap;

public class IntegerToRoman {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public  static String convert(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + convert(number - l);
    }
}
