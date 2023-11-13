package test;

public class PalindromeWord {
    public static void main(String[] args) {
        String str = "NITIN";

        char[] arr = str.toCharArray();

        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()-1 ; j >=0; j--) {
                flag = arr[i] == arr[j];
            }
        }

        System.out.println(" Palindome:"+ flag);
    }
}
