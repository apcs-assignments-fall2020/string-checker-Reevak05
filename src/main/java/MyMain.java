import java.util.Scanner;

public class MyMain {

    // Counts the number of 'a', 'b', and 'c' chars in str
    //Cameron Shaw told me he used replace() for this problem
    public static int countABC(final String str) {
        return str.length()-str.replace("a","").replace("b", "").replace("c", "").length();
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(final String str) {
        for (int i = 0; i<str.length()-2; i++) if (str.substring(i, i+3).equals("the")||str.substring(i, i+3).equals("The")) return true;
        /* I orignally used
        for (int i = 0; i<str.length()-2; i++) if (str.substring(i, i+3).toLowerCase().equals("the")) return true;
        for line 14 (using .toLowerCase) but technically, as the assignment says the method should return based on whether or not the string "contains 'the' or 'The'", using .toLowerCase would not be correct. */
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(final String str) {
        for (int i = 0; i<(str.length()/2); i++) if (!str.substring(i, i+1).toLowerCase().equals(str.substring(str.length()-(i+1), str.length()-i).toLowerCase())) return false;
        return true;
    }

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Please type words on your letter buttons:");
        String words = scan.nextLine();
        System.out.println("There are "+countABC(words)+" 'a's, 'b's, or 'c's in the string.");
        System.out.println("The string contains 'the' or 'The': "+containsThe(words));
        System.out.println("The string is a palindrome: "+isPalindrome(words));
        scan.close();
    }
}
