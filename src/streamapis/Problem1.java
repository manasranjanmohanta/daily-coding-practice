package streamapis;

import java.util.List;
import java.util.stream.Collectors;

// Input a list of strings then convert them into uppercase or lowercase using stream api.

public class Problem1 {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("OOPs", "Inheritance", "Polymorphism", "Abstraction", "Encapsulation");

        // converting each element to lower case
        List<String> listOfStringsInLowerCase = listOfStrings.stream()
                .map(element -> element.toLowerCase())
                .collect(Collectors.toList());

        // converting each element to upper case
        List<String> listOfStringsInUpperCase = listOfStrings.stream()
                .map(element -> element.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("The strings in lowercase: " + listOfStringsInLowerCase.toString());
        System.out.println("The strings in uppercase: " + listOfStringsInUpperCase.toString());
    }
}
