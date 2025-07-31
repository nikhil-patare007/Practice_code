package Java2025;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Nikhil";

        char[] arr = str.toCharArray();

        String reversed = "";

        for (int i = arr.length-1; i>=0; i--) {
            reversed = reversed + arr[i];
        }
        System.out.println(reversed);
    }
}
