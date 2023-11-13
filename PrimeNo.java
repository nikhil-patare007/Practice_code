package test;

public class PrimeNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 11, 15, 17, 19};

        System.out.println("Prime numbers in the array:");
        for (int num : arr) if (isPrime(num)) System.out.println(num);
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
