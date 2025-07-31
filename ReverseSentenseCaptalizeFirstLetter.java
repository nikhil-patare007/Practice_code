package Java2025;

public class ReverseSentenseCaptalizeFirstLetter {

    public static void main(String[] args) {

        String input = "I Love Java Coding.";

        String[] words = input.split("\\s");

        StringBuilder result = new StringBuilder();

        for(String word: words) {

            if(word.trim().isEmpty()) {
                result.append(word);
            }else {
                result.append(ReverseSentenseCaptalizeFirstLetter.reverseWordKeepSymbolsIntact(word+ " "));
            }
        }
        System.out.println(result);
    }

    public static String reverseWordKeepSymbolsIntact(String str) {

        char[] word = str.toCharArray();
        int length = word.length;

        int start = 0;
        int end = length-1;

        while (start<end) {

            if(!Character.isLetter(word[start])) {
                start++;
            }else if(!Character.isLetter(word[end])){
                end--;
            }else {
                char temp = word[end];
                word[end] = word[start];
                word[start] = temp;
                start++;
                end--;
            }

        }
        String modified = String.valueOf(word);
        return (modified.substring(0,1).toUpperCase() + modified.substring(1).toLowerCase());
    }
}
