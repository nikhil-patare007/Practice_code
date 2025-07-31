package Java2025;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {

        int a =10;
        int b = 20;

        System.out.println("Before swap :" + "A is " + a + " B is " + b);

        a = a + b; // a becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20

        /*a = a ^ b;
        b = a ^ b;
        a = a ^ b;*/

        /*a = a * b;
        b = a / b;
        a = a / b;*/


    }
}
