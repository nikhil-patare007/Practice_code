package test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharactersInString {
    public static void main(String[] args) {
        String str1 = "gfhjsbfjhdbfvj";

        Map<Character, Long> countCharacters = str1.chars().mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countCharacters);

        Map<Character, Integer> countOfChar =  new HashMap<>();
        for(char c: str1.trim().toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                countOfChar.put(c, 1);
            }
        }

        for (Map.Entry e : countOfChar.entrySet()) {
            System.out.print(" "+e.getKey() + " :" + e.getValue());
        }
    }
}
