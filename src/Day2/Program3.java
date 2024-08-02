package Day2;

// How do you remove spaces from a string in Java?
public class Program3 {
    public static String removeSpaces(String str) {
//        return str.replaceAll("\\s", "");

        // Using StringBuilder
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ') {
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();

        // Using StringBuffer
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ') {
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();


        String[] ch = str.trim().split(" ");
        String result = "";
        for (int i = 0; i < ch.length; i++) {
            result += ch[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String str = " Hello World ";
        System.out.println(removeSpaces(str));
    }
}

// Time Complexity : O(n^2)

// Space Complexity : O(n)