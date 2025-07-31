package Java2025;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = {1, 2, 10, 8, 7, 5, 4, 3, 9};

        getTriplet(arr, 13);

    }



    public static void  getTriplet(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int sum =0;
        boolean found = false;

        for (int i = 0; i < nums.length-2; i++) {

            int left = i+1;
            int right = n-1;

            while (left<right) {
                sum = nums[i] +nums[left] + nums[right];

                if(sum == target) {
                    found = true;
                    System.out.println(nums[i] +" "+ nums[left]  +" "+ nums[right]);
                    left++;
                    right--;
                } else if (sum <target ) {
                    left++;
                }else {
                    right--;
                }
            }

            if(!found) {
                System.out.println("Not found");
            }
        }


    }

}
