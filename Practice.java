package Java2025;

import java.util.HashSet;

public class Practice {

    public static void main(String[] args) {


        String input = "babcdaba";

        String longestSubstring = " ";

        int right = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < input.length()) {

            if(!set.contains(input.charAt(right))) {
                set.add(input.charAt(right));
                right++;
                longestSubstring = input.substring(left, right);
                if(right - left > longestSubstring.length()) {
                    longestSubstring = input.substring(left, right);
                }
            }else {
                set.remove(input.charAt(left));
                left++;
            }
        }
        System.out.println(longestSubstring);
    }
}
