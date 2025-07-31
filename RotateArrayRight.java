package Java2025;

import java.util.Arrays;

public class RotateArrayRight {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int k =2;

        rotateArray(arr, k);

        System.out.println(Arrays.toString(arr));

    }


    public static void rotateArray(int[] arr, int k) {

        int n = arr.length;  // Get the total number of elements in the array
        k = k % n; // If k is larger than the array length, rotating k times is same as rotating k % n times


        reverse(arr, 0, n-1); //{5,4,3,2,1}
        reverse(arr, 0, k-1); //{4,5,3,2,1}
        reverse(arr, k, n-1); //{4,5,1,2,3}

    }

    public static void reverse(int[] arr, int start, int end) {
        while(start< end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;

        }
    }
}
