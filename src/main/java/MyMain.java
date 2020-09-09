import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    //Cameron Shaw told me he used replace() for this problem
    public static int countABC(final String str) {
        return str.length()-str.replace("a","").replace("b", "").replace("c", "").length();

    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(final String str) {
        for (int i = 0; i<str.length()-2; i++) if (str.substring(i, i+3).toLowerCase().equals("the")) return true;
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(final String str) {
        // REPLACE WITH YOUR CODEE
        return false;
    }
    
    
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);

        System.out.println(countABC("kevabiuasce"));
        System.out.println(containsThe("efwefwewe"));
        System.out.println(containsThe("oefwoeifowiejthe"));
    }
}
