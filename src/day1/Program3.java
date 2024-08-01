package day1;

import java.util.Scanner;

public class Program3 {
    public static boolean isVowelExists(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        System.out.println(isVowelExists(str));

    }
}
