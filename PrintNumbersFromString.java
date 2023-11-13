package test;

public class PrintNumbersFromString {
    public static void main(String[] args) {
        String str = "abc32%126d";

        char[] charArr = str.toCharArray();

        for (char ch: charArr) {
            if(Character.isDigit(ch)){
                System.out.print(ch);
            }
        }

    }
}
