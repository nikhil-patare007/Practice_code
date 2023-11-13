package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MostOcuuredDuplicateHighestWord {
    public static void main(String[] args) {
        String str = "Nikhil is attending interview is interview";

        String[] words = str.split("\\s");

        Map<String, Integer> wordOccurrences = new HashMap<>();

        for(String word : words) {
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) +1);
        }

       Integer[] values = wordOccurrences.values().toArray(new Integer[0]);

        int tmp;
        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; j <values.length ; j++) {
                if(values[i] < values[j]) {
                   tmp = values[i];
                   values[i] = values[j];
                   values[j] = tmp;
                }
            }
        }

        List<String> maxKeys = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            if (entry.getValue() == values[0]) {
                maxKeys.add(entry.getKey());
            }
        }

        String maxLengthString = maxKeys.get(0);

        for (String word : maxKeys) {
            if (word.length() > maxLengthString.length()) {
                maxLengthString = word;
            }
        }

        System.out.println(maxLengthString);
    }
}
