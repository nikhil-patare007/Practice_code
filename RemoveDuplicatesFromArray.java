package Java2025;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 4, 9, 2, 1, 7};

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
