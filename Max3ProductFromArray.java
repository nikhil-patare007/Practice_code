package Java2025;

import java.util.Arrays;

public class Max3ProductFromArray {

    public static void main(String[] args) {
        int[] arr = {-1000, -2000, 23, 789, 537, 98, 0};


        Arrays.sort(arr);

        int positiveProduct = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];

        int negativeProduct = arr[0] * arr[1] * arr[arr.length - 1];

        int max = Math.max(positiveProduct, negativeProduct);

        if (max == positiveProduct) {
            System.out.println(max);
            System.out.println(arr[arr.length - 1] + " " + arr[arr.length - 2] + " " + arr[arr.length - 3]);
        } else {
            System.out.println(max);
            System.out.println(arr[0] + " " + arr[1] + " " + arr[arr.length - 1]);
        }
    }
}
