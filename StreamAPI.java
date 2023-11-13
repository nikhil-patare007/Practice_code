package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 3, 7, 5, 8);
        Stream<Integer> sortedData = nums.stream().sorted();
        sortedData.forEach(n -> System.out.print(" " + n));

//        System.out.println();
//        Stream<Integer> square = nums.stream().map(n -> n * 2);
//        square.forEach(n -> System.out.print(" " + n));

        //even odd
        System.out.println();
        nums.stream().filter(n-> n%2 ==1).forEach(n -> System.out.print(" "+n));

        System.out.println();
        for(int i: nums) {
            if(i%2==1) {
                System.out.print(" " +i);
            }
        }

        System.out.println();
        int result =  nums.stream().map(n -> n*2).reduce(0, (c,e)-> c+e);
        System.out.println(result);

        List<Integer> listOfInt = nums.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), n -> {
                    Collections.reverse(n);
                    return n;
                }));
        System.out.println(listOfInt);

        Collections.reverse(nums);
        System.out.println(nums);

        int[] numbers = {5, 9, 11, 2, 8, 21, 1};

        System.out.println(nums.stream().sorted().distinct().skip(1).findFirst().get());
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargestNumber);

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
