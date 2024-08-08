package streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a java program to sort a list of strings
// alphabetically using Java 8 Stream API
public class Problem3 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("dinosaur", "elephant", "apple", "cat", "banana");

        List<String> sortedStrings = listOfStrings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedStrings);
    }
}
