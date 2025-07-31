package Java2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String [] strArr =  {"java", "ajav", "aajv", "abcd", "bcda", "xyza"};

        Set<String> uniqueWords = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for(String word: strArr) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String sortedStr = new String(chars);

            if(!uniqueWords.contains(sortedStr)) {
                uniqueWords.add(sortedStr);
                list.add(word);
            }
        }

        for( String word : list) {
            System.out.println(word);
        }
    }
}
