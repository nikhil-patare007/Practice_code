

public class PerfectNo {
    public static boolean isPerfect(int num){
        int sum=0;
        for (int i = 1; i <=num/2 ; i++) {
            if(num%i==0){
                sum=sum+i;
            }


        }
        if (num==sum)
            return  true;
        else
            return false;

    }

    public static void main(String[] args) {
        //PerfectNo n1 =new PerfectNo();
          int num=27;
          boolean b= isPerfect(num);
          if(b){
              System.out.println("is Perfect");
          }
          else
              System.out.println("is not");
    }
}