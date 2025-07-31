package Java2025;

public class SumOfBetweenElements {

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 3, 4, 5, 9, 2, 1, 4, 6, 7, 8, 9, 2};

        boolean inside = false;
        int sum = 0;

        for (int num : arr) {

            if (num == 6) {
                sum = sum + 6;
                inside = true;
            } else if (num == 9 && inside) {
                sum = sum + 9;
                inside = false;

            } else if (inside) {
                sum = sum + num;
            }
        }

        System.out.println(sum);

    }
}
