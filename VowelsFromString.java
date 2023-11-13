package test;

import java.util.List;
import java.util.stream.Collectors;

public class VowelsFromString {
    public static void main(String[] args) {
        String input = "Hello, this is an example of counting vowels.";

        List<Character> vowelCount = input.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        System.out.println(vowelCount);
    }
}
