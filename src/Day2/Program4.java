package Day2;
// How do you remove leading and trailing spaces from a string in Java?
public class Program4 {
    public static void main(String[] args) {
        String str = "  Hello World   ";
        System.out.println("Original String: " + str);
        str = str.trim();
        System.out.println("Trimmed String: " + str);
    }

}

// Time Complexity : O(n)

// Space Complexity : O(n)
