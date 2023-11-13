package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "PROGRESSION";
        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = input.replaceAll("\\s", "").toLowerCase().toCharArray();

        for(char c : charArray) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c,1);
            }
        }
        System.out.println(charCountMap);

        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        int maxCount = 0;
        char maxChar = 0;

        for(Map.Entry<Character, Integer> entry : entrySet) {
            if(entry.getValue()>maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Maximum Occurring char and its count :"+maxChar+" : "+maxCount);



        Map<Character, Long> mapsData = input
                .chars()
                .mapToObj(ch -> (char) ch)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        mapsData.forEach((ch, freq) -> System.out.println("Character " + ch + " count " + freq));
    }
}
