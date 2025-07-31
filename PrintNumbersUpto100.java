package Java2025;

public class PrintNumbersUpto100 {

    public static void main(String[] args) {
     printNum(1, 100);
    }

    public static void printNum (int num, int max) {
        if(num > max) {
            return;
        }
        System.out.print(num + " ");
        printNum(num + 1, max);
    }
}
