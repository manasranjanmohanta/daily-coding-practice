package Day2;

import java.util.ArrayList;

// How  do you check if a list of integers contains only odd numbers in Java?
public class Program1 {

    public static boolean isOdd(ArrayList<Integer> numbers) {

//        for (int element : numbers) {
//            if (element % 2 == 0) {
//                return false;
//            }
//        }
//        return true;

//        if the string is large then we can use parallel stream for faster processing
        return numbers
                .parallelStream()
                .allMatch(num -> num % 2 != 0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(13);
        numbers.add(16);

        System.out.println(isOdd(numbers));

    }
}


// TimeComplexity : Worst case = O(n) and Best case = O(1)

// Space Complexity : O(1)