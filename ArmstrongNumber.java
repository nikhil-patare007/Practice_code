package test;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371;
        int initailNo, remainder, result = 0;

        initailNo = num;

        while (initailNo != 0) {
            remainder = initailNo % 10;
            result += Math.pow(remainder, 3);
            initailNo = initailNo / 10;
        }

        if (result == num) {
            System.out.println(num + " is armstrong");
        } else {
            System.out.println(num + " is not armstrong");
        }
    }
}
