package Java2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 5, 4, 3, 9};
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        permutations(arr, 0,13, new ArrayList<>(), result);

        for(List<Integer> combinations : result ) {
            System.out.println(combinations);
        }

    }

    static void permutations(int [] arr, int index, int target, List<Integer> current, List<List<Integer>> result) {

        if(target ==0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i <arr.length ; i++) {

            if(arr[i] > target) break;

            if(i> index && arr[i] ==  arr[i-1]) continue;

            current.add(arr[i]);
            permutations(arr, i + 1, target-arr[i], current, result);
            current.remove(current.size()-1);
        }
    }
}
