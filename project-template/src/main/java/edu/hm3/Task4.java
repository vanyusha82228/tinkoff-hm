package edu.hm3;

import java.util.TreeMap;

public class Task4 {
    public static String convertToRoman(int number) {
        if (number <= 0 || number > 3999) {
            return "";
        }
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder romanNumber = new StringBuilder();
        for (int key : map.descendingKeySet()) {
            while (number >= key) {
                romanNumber.append(map.get(key));
                number -= key;
            }
        }
        return romanNumber.toString();

    }
}
