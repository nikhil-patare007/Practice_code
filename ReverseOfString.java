package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOfString {
    public static void main(String[] args) {
        String str = "Hello World Java Stream";

        String[] str2 = str.split("\\s");


        for (String str1 : str2) {
            char[] charArr = str1.trim().toCharArray();

            for (int i = charArr.length - 1; i >= 0; i--) {
                System.out.print(charArr[i]);
            }
            System.out.print(" ");
        }

        System.out.println();

        for(String word : str2) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse().append(" "));
        }

        System.out.println();

        String reverseEachWordOfString = Arrays.stream(str2)
                .map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.print(reverseEachWordOfString);

    }
}
