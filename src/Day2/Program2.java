package Day2;

// How do you check whether a string is a palindrome in Java?
public class Program2 {

    public static boolean isPalindrome(String actualString) {
        // Reverse the string
        String reversedString = new StringBuilder(actualString).reverse().toString();
        if (reversedString.equals(actualString)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "mom";
        System.out.println(isPalindrome(str));
    }
}

// Time Complexity : O(n)

// Space Complexity : O(n)