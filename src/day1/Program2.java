package day1;

import java.util.Scanner;

public class Program2 {
    public static void swap(int num1, int num2) {
        System.out.println("Before swapping : " + num1 + "," + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping : " + num1 + "," + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        swap(num1, num2);

    }
}
