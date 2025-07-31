package Java2025;

import java.util.Arrays;

public class TripletSum {

    public static void main(String[] args) {

        int[] nums = {1, 4, 2, 3, 5, 7, 0, -1};
        int target = 6;

        findTriplets(nums, target);


    }


    public static void findTriplets(int [] nums, int target) {

        int n = nums.length;
        boolean found = false;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int left = i +1;
            int right = n-1;

            while (left < right) {

             int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    found = true;
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            if(!found) {
                System.out.println("No triplet found");
            }
        }
    }
}
