package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InitialUpperCase {
    public static void main(String[] args) {
        String input = "I love my india";


        System.out.println(Arrays.stream(input.split("\\s")).map(word -> Character.toUpperCase(word.charAt(0))
                + word.substring(1)).collect(Collectors.joining(" ")));

        String[] words = input.split("\\s");

        String str = "";

        for(String w :words) {
            String word =  w;
            if(!Character.isUpperCase(word.charAt(0))) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }

            str  = str.concat(word).concat(" ");
        }

        System.out.println(str);
    }
}
