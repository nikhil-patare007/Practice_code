package Java2025;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        List<Integer> maxSubArray = maxSubArray(nums);
        System.out.println("Maximum sum subarray: " + maxSubArray);
    }


    public static List<Integer> maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = nums[0];
        int start =0;
        int end =0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {

            if(nums[i] > nums[i] + currentSum) {
                currentSum = nums[i];
                tempStart = i;
            }else {
                currentSum = currentSum + nums[i];
            }

            if(currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end ; i++) {
            result.add(nums[i]);
        }
        return result;
    }


}
