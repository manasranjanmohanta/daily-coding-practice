package day1;

import java.util.Scanner;

public class Program5 {
    public static void printFibonacci(int first, int second, int n) {
        if (n == 0) {
            return;
        }

        int temp = first + second;
        first = second;
        second = temp;
        System.out.println(temp);
        printFibonacci(first, second, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms you want to print : ");
        int term = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        printFibonacci(0, 1, term - 2);
    }
}
