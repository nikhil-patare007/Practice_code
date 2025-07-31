package Java2025;

import java.util.Arrays;

public class SegregateZeroToLeft {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 4, 0, -12};
        int [] result = new int[arr.length];
        int index = result.length - 1;

        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i] != 0) {
                result [index ] = arr [i];
                index --;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
