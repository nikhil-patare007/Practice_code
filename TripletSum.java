package test;

import java.util.HashSet;

public class TripletSum {
    public static void main(String[] args) {

        int [] arr= { 1, 4, 45, 6, 10, 8 };
        int sum = 22;


        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length-2; i++) {
            int curr_sum = sum - arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if(set.contains(curr_sum-arr[j])) {
                    System.out.println("Triplet is " + arr[i]+" "+arr[j]+" "+(curr_sum - arr[j]));
                }
                set.add(arr[j]);
            }
        }
        System.out.println(set.size());
    }
}
