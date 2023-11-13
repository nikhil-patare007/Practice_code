package test;

import java.util.Arrays;

public class OddEvenFromArray {
    public static void main(String[] args) {
        int[] array1 = {10, 11, 15, 8, 7, 2};
        Arrays.stream(array1).boxed().filter(n -> n % 2 ==0 ).forEach(n -> System.out.println(n));

        for (int i : array1) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
