package Java2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReorderElementsArray {

    public static void main(String[] args) {

        int[] arr = {0, 3, -2, -1, 5, 0, 2, -3, -1, 0, 1, -3, -2};

        List<Integer> positives = new ArrayList<>();
        List<Integer> zerosAndNegatives = new ArrayList<>();

        for( int num : arr) {
            if(num <= 0) {
                zerosAndNegatives.add(num);
            }else {
                positives.add(num);
            }
        }

        System.out.println(positives);
        System.out.println(zerosAndNegatives);

        Collections.sort(zerosAndNegatives);

        List<Integer> result = new ArrayList<>();

        result.addAll(positives);
        result.addAll(zerosAndNegatives);

        System.out.println(result);
    }
}
