package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachCharacter {
    public static void countFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        countFrequency("hello world");
    }

}
