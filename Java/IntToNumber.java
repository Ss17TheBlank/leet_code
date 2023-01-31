// https://leetcode.com/problems/integer-to-roman/

import java.util.LinkedHashMap;

public class IntToNumber {
    public static String intToRoman(int num) {
        LinkedHashMap<Integer,String> dict = new LinkedHashMap<Integer, String>();
        dict.put(1000, "M");dict.put(900, "CM");dict.put(500, "D");dict.put(400, "CD");dict.put(100, "C");
        dict.put(90, "XC");dict.put(50, "L");dict.put(40, "XL");dict.put(10, "X");dict.put(9, "IX");dict.put(5, "V");
        dict.put(4, "IV");dict.put(1, "I");
        StringBuilder finalRoman = new StringBuilder();
        Integer currentNum = num;
        for (Integer key: dict.keySet()) {
            while (key <= currentNum && currentNum != 0) {
                finalRoman.append(dict.get(key));
                currentNum -= key;
            }
            if (currentNum == 0){
                break;
            }
        }
        return finalRoman.toString();
    }
}
