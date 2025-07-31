package Java2025;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringWord {

    public static void main(String[] args) {

        String input = "nikhil is is very very good boy is that correct";

        String [] arr = input.split("\\s");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word : arr) {
          map.put(word, map.getOrDefault(word, 0)+1);
        }

        System.out.println(map);

//        int maxCount = 0;
//        String maxWord = "";
//
//        for(Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > maxCount) {
//                maxCount = entry.getValue();
//                maxWord = entry.getKey();
//            }
//        }
//
//        System.out.println(maxWord);


        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        String maxWord = "";
        String secondMaxWord = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            String key = entry.getKey();

            if (value > max) {
                secondMax = max;
                secondMaxWord = maxWord;

                max = value;
                maxWord = key;

            } else if (value > secondMax && value != max) {
                secondMax = value;
                secondMaxWord = key;
            }
        }

        System.out.println("Second Max Occurred Word: " + secondMaxWord + " (Count: " + secondMax + ")");
    }
}
