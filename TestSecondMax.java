package test;

import java.util.*;
import java.util.stream.Collectors;

public class TestSecondMax {

    public static void main(String[] args) {

        int[] nums = {1, 3, 6, 9, 3, 5, 7};

        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }


        System.out.println();
        String str = " Hello my friend";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        String[] words = str.split("\\s");
        for (String word : words) {
            for (int i = word.length()- 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println();

        System.out.println(
                Arrays.stream(words).map(w-> new StringBuilder(w).reverse()).collect(Collectors.joining(" "))
        );


        String numStr = "cadjfhg899873ebjqf899";
        for (int i = 0; i < numStr.length(); i++) {
            if(Character.isDigit(numStr.charAt(i))) {
                System.out.print(numStr.charAt(i));
            }
        }


        String perm = "ABC";
        allPermutations(perm, 0, perm.length());



        String str2 = "Nikhil is attending interview is interview";

        String[] words2 = str2.split("\\s");

        HashMap<String, Integer> wordOccurrences = new HashMap<>();

        for(String word: words2){
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0)+1);
        }

        Integer[] maxWordsValue = wordOccurrences.values().toArray(new Integer[0]);

        Integer maxvalue = Arrays.stream(maxWordsValue).sorted(Comparator.reverseOrder()).findFirst().get();

        List<String> maxKeys = new ArrayList<>();

       for(Map.Entry<String, Integer> entry: wordOccurrences.entrySet()) {
           if(entry.getValue() == maxvalue) {
               maxKeys.add(entry.getKey());
           }
       }

       int maxStringLength = maxKeys.get(0).length();
       String maxWord = "";

       for(String w: maxKeys) {
           if(w.length()>maxStringLength) {
               maxWord = w;
           }
       }

        System.out.println(maxWord);

    }

    static String swapStr(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j]   = tmp;
        return String.valueOf(arr);
    }

    static  String allPermutations(String str, int start, int end) {
        if(start == end-1) {
            System.out.println(str);
        }

        for (int i = start; i <end ; i++) {
             swapStr(str, start, i);
             allPermutations(str, start + 1, end);
             swapStr(str, start, i);
        }
        return str;
    }
}
