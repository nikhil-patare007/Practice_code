package Java2025;

public class ReverseStringByKeepingTheSymbols {


    public static void main(String[] args) {

        String str = "*sncy$8n#mc$";

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while(start < end) {

            if(!Character.isLetterOrDigit(arr[start])) {
                start ++;
            } else if (!Character.isLetterOrDigit(arr[end])) {
                end --;
            }else {
                char temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;

                start ++;
                end --;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}
