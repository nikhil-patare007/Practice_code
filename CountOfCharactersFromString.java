package Java2025;

import java.util.HashMap;

public class CountOfCharactersFromString {

    public static void main(String[] args) {

        String str = "Hello";

        str = str.replaceAll("\\s", "").toLowerCase();

        char[] arr = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for( char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}
