package Java2025;

public class ReverseStringByKeepingThePosition {

    public static void main(String[] args) {

        String str = "Nikhil Arvind Patare";

        String[] words = str.split("\\s");

        String reversedSentense = " ";

        for (String word : words) {

            char [] arr = word.toCharArray();
            String reverseWord = " ";
            for (int i = arr.length-1; i >=0 ; i--) {
                reverseWord = reverseWord + arr[i];
            }
            reversedSentense = reversedSentense + reverseWord;
        }
        System.out.println(reversedSentense);
    }
}
