package Java2025;

import java.util.HashMap;
import java.util.Map;

public class SecondMaxOccuredIntegerFromArray {
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,2,1,1,1,4,5,2,2,2,4,4,4,4};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find maximum frequency
        int maxFreq = 0;
        int secondMaxFreq = 0;

        Integer maxResult = null;
        Integer secondMaxResult = null;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMaxResult = maxResult;
                maxFreq = entry.getValue();
                maxResult = entry.getKey();
            } else if (entry.getValue()>secondMaxFreq && entry.getValue()!=maxResult) {
                secondMaxFreq = entry.getValue();
                secondMaxResult = entry.getKey();
            }
        }

        System.out.println(frequencyMap);
        System.out.println(secondMaxFreq);
        System.out.println(secondMaxResult);

    }
}
