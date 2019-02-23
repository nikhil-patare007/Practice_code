import java.util.Scanner;

public class Palinstring {
public void palindromeString(String original) {
    String  reverse = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    original = sc.nextLine();
    int length = original.length();
    for (int i = length - 1; i >= 0; i--)
        reverse = reverse + original.charAt(i);
    if (original.equals(reverse))
        System.out.println("palindrome");
    else
        System.out.println("not palindrome");
}
    public static void main(String[] args) {
        String original;
        Palinstring p=new Palinstring();
        p.palindromeString("");
    }
}
