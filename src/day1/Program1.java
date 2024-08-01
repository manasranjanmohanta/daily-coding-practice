package day1;

import java.util.Scanner;

/* APPROACH-1*/

//public class day1.Program1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a string : ");
//        String str = sc.nextLine();
//
//        String reversed = new StringBuilder(str).reverse().toString();
//
//        System.out.println("The reverse of string is : " + reversed);
//
//    }
//}

/* APPROACH-2 */
public class Program1 {
    public static String reverse(String str) {

        int n = str.length();
//        String reversed = "";
//        for (int i = n - 1; i >= 0; i--) {
//            reversed = reversed + str.charAt(i);
//        }
//        return reversed;

        StringBuilder reversed = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("The reversed string is : " + reverse(str));

    }
}
