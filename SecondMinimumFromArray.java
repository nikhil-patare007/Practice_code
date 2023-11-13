package test;

import java.util.Arrays;

public class SecondMinimumFromArray {
    public static void main(String[] args) {
        int[] array1 = {10, 11, 15, 8, 7, 2};

        Integer secondMinNum = Arrays.stream(array1)
                .boxed()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondMinNum);


        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for( int num : array1) {
            if(num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }
        System.out.println(secondMin);
    }
}
