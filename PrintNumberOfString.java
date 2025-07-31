package Java2025;

public class PrintNumberOfString {

    public static void main(String[] args) {

        String str = "abc32%21cd9";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(Character.isDigit(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
