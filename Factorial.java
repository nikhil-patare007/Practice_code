package Java2025;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(Factorial.factorial(5));
    }

    public static long factorial(int num) {

        long result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i;
        }
        return  result;
    }
}
