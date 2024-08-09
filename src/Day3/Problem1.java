package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Sort an array of elements or a list of elements using stream API
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {23, 12, 4, -23, 56, 10};

        // Sorting an array of numbers
        List<Integer> sortedArray = Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedArray);

        // Sorting a list of numbers
        List<Integer> unsortedList = Arrays.asList(22, 12, 4, -23, 56, 10);

        List<Integer> sortedList = unsortedList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
