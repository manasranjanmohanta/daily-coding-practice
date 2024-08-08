package streamapis;

// WAP to remove duplicate elements from an ArrayList using stream api

import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = List.of(1, 2, 3, 2, 3, 4, 5);

        List<Integer> distinctElement = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctElement);
    }
}
