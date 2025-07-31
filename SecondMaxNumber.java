package Java2025;

public class SecondMaxNumber {

    public static void main(String[] args) {

        int [] arr = {1,3,4,32,56,32,67,21,45};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for(int num : arr) {
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println(secondMax);


    }
}
