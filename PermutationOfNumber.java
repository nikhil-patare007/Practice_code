package test;

public class PermutationOfNumber {
    public static void main(String[] args) {
        int num = 123;

        System.out.println(permutation(num, 0,String.valueOf(num).length()));

    }

    static String swapNumber(int num, int i, int j) {
        char [] arr = String.valueOf(num).toCharArray();
        char tmp = 0;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return String.valueOf(arr);
    }


    static int permutation (int num, int start, int end) {
        if(start == end-1){
            System.out.println(num);
        }else {
            for (int i = start; i < end; i++) {
                num = Integer.parseInt(swapNumber(num, start, i));
                permutation(num, start+1,end);
                num = Integer.parseInt(swapNumber(num, start, i));
            }
        }
        return num;
    }

}
