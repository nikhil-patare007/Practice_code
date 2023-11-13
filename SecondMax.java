package test;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMax {
    public static void main(String[] args) {
        int[] array1 = {10, 11, 15, 8, 7, 2};

        int secondMax = Arrays.stream(array1)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondMax);

        int firstMax =  Integer.MIN_VALUE;
        int secndMax =  Integer.MIN_VALUE;

        for(int num : array1) {
            if(num > firstMax) {
                secndMax = firstMax;
                firstMax = num;
            } else if (num > secondMax &&  num != firstMax) {
                secndMax = num;
            }
        }
        System.out.println(secndMax);
    }
}
