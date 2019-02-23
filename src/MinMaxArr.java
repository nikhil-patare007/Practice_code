
public class MinMaxArr {
public void minMax(int[] arr){
    int min=arr[0];
    int max=arr[0];
int temp,temp1,secmax=0;
    for (int i = 0; i <arr.length ; i++) {
        if(arr[i]>max) {
            temp = arr[i];
            arr[i] = max;
            max = temp;
        }
            else if(arr[i]<min) {
            temp1 = arr[i];
            arr[i] = min;
            max = temp1;
        }
    }
    for (int i = 0; i <arr.length ; i++) {
        if(arr[i]>secmax && arr[i]<max){
            temp=arr[i];
            arr[i]=secmax;
            secmax=temp;
        }
    }
    System.out.println("max is"+max);
    System.out.println("min is"+min);
    System.out.println("second max is"+secmax);
}

    public static void main(String[] args) {
        int arr[]={10,6,14,25};
        MinMaxArr m1= new MinMaxArr();
        m1.minMax(arr);

    }
}
