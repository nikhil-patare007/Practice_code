package test;

import java.util.Arrays;
import java.util.Comparator;

public class FrequencyNumber {
    public static void main(String[] args) {


        int[] arr = {1, 3, 4, 6, 8, 3, 5, 7, 9, 5, 2};

        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                   tmp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());


        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        System.out.println(secondMax);
        System.out.println(firstMax);
    }
}
