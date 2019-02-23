

public class ThreeDArr {
    public static void main(String[] args) {
        int arr[][][]=new int[4][4][4];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                for (int k = 0; k <arr.length ; k++) {
                    arr[i][j][k]=i+j+k;

                }
            }
        }

    for(int i[][]:arr){
        for (int j[]:i){
            for (int k:j){
                System.out.print("   "+k);
            }
            System.out.println();
        }
    }




    }
}
