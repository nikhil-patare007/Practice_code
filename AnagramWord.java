package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramWord {
    public static void main(String[] args) {
        String a = "motherinlaw";
        String b = "hitlerwoman";

        String sortedStr1 = Arrays.stream(a.replaceAll("\\s+", "").toLowerCase().split(""))
                .sorted()
                .reduce((s1, s2) -> s1 + s2)
                .get();


        String sortedStr2 = Arrays.stream(b.replaceAll("\\s+", "").toLowerCase().split(""))
                .sorted()
                .reduce((s1, s2) -> s1 + s2)
                .get();

        System.out.println(sortedStr2.equals(sortedStr1));

        String str1 = a.replaceAll("\\s+", "").toLowerCase();
        String str2 = b.replaceAll("\\s+", "").toLowerCase();

        System.out.println(areAnagrams(str1,str2));
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false; // If the lengths are different, they cannot be anagrams
        }

        // Count the occurrences of each character in str1
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Compare the counts with str2
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false; // Character not present in str1
            }
            int count = charCountMap.get(c);
            if (count == 1) {
                charCountMap.remove(c);
            } else {
                charCountMap.put(c, count - 1);
            }
        }
        return charCountMap.isEmpty(); // If the map is empty, they are anagrams
    }
}
