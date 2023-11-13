package test;

public class PermutationsOfString {
    public static void main(String[] args) {
        String str = "ABCD";
        int len = str.length();
        generatePerms(str, 0, len);
    }

    public static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return String.valueOf(arr);
    }
    static String generatePerms(String str, int start, int end) {

        if (start == end - 1) {
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i);
                generatePerms(str, start+1, end);
                str = swap(str, start, i);
            }
        }
        return str;
    }
}
