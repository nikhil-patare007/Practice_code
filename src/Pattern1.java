public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j<=4 ; j++) {
                if(i==1|| i==4 || j==1||j==4)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //*****************************************


        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
               int k=j+i-1;
               if(k>4)
                System.out.print(k-4 +" ");
               else
                   System.out.print(k+ " ");
            }
            System.out.println();
        }

        System.out.println();
      //********************************************
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                int k=i+j;
                if(k%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
//********************************************************************
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {

                    System.out.print(i+ " ");

            }
            System.out.println();
        }
//******************************************************************
        System.out.println();
        for (int i = 0; i <5 ; i++) {
            for (int j = 5-i; j >1  ; j--) {

                System.out.print(" ");
            }

                for (int j = 0; j <=i ; j++) {
                    System.out.print("* ");
                }


            System.out.println();
        }

        //******************************************************************
        System.out.println();
        for (int i = 5; i >=1 ; i--) {
            for (int j =5; j>i ; j--) {
                System.out.print(" ");
            }
            for (int j =1; j <(i*2) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*******************************************************

        System.out.println();
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            for (int j =i; j <5 ; j++) {
                System.out.print(" ");
            }
            for (int j =1 ; j <(i*2) ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 4; i>=1 ; i--) {
            for (int j =5 ; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <(i*2) ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


  }

}
