package day1;

import java.util.Scanner;

public class Program4 {
    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        System.out.println(isPrime(number));
    }
}
