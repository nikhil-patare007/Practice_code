

public class MostOccuredChar {
     public static int ASCII_Char=256;
     static char getMaxOcuuringChar(String str){
         int[] count=new int[ASCII_Char];

         for (int i = 0; i <str.length() ; i++) {
          count[str.charAt(i)]++;
         }
         int max=-1;
         char res=' ';

         for (int i = 0; i <str.length() ; i++) {
             if(max<count[str.charAt(i)]){
                 max=count[str.charAt(i)];
                 res=str.charAt(i);
             }

         }
         System.out.println("No of occurances "+max);
         return  res;
     }

    public static void main(String[] args) {
        String str="nikhlhsubbhsbjbskjb";
        System.out.println("most occured char is    "+getMaxOcuuringChar(str));
    }
}
