package Java2025;

public class ThirdMax {

    public static void main(String[] args) {

        int[] arr = {12, 2, 34, 45, 56, 67, 44};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;


        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = first;
                third = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }

        }

        System.out.println(third);
        System.out.println(second);


    }
}
