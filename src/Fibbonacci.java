import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        int a=1,b=1;
        int k;
        Scanner sc =new Scanner(System.in);
        k=0;
        System.out.println("Enter the no");
        int n=sc.nextInt();
        System.out.print("1 1 ");
        while(k<=n){
            k=a+b;
            if(k>=n)
            break;
            System.out.print(k+ " ");
            a=b;
            b=k;
        }
    }
}
