package test;

import java.util.Arrays;

public class SegregateZeroToLeftClass {
    private void segregateZeroToLeft(int[] arr) {
        int countOfZero = 0;
        int sizeOfArray =  arr.length;
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] == 0) {
                countOfZero++;
            }
        }

        for (int i = 0; i < countOfZero; i++) {
            arr[i] = 0;
        }

        for (int i = countOfZero; i < sizeOfArray; i++) {
            arr[i] = 1;
        }

        System.out.println(Arrays.toString(arr));
    }
    private void swapLogicSegregate(int[] arr){
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[left];
            arr[left] = arr[i];
            arr[i] = temp;
            left = left +1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] inputArray = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        SegregateZeroToLeftClass segregateZeroToLeftClass = new SegregateZeroToLeftClass();
        segregateZeroToLeftClass.segregateZeroToLeft(inputArray);
        segregateZeroToLeftClass.swapLogicSegregate(inputArray);
        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));

        System.out.println(Arrays.stream(inputArray)
                .boxed()
                .sorted()
                .toList()
        );
    }
}
