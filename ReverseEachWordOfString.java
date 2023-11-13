package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String s = "I love my India";

        //using Stream
        System.out.println(
                Arrays.stream(s.split("\\s")).map(word -> new StringBuilder(word).reverse().toString())
                        .collect(Collectors.joining(" "))
        );

        //Using loops
        String[] words = s.split("\\s");
        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i);
            }
            System.out.print(reverseWord.trim() + " ");
        }


        //Suing StringBuilder
        System.out.println();
        StringBuilder reverse = new StringBuilder(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            reverse = reverse.append(sb).append(" ");
        }
        System.out.println(reverse.toString().trim());
    }
}
