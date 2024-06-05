import java.util.Scanner;

public class Q4 {
// Write a Java program to check if a string is a palindrome.
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();
        scanner.close();

        if (checker(input)) {
            System.out.println(input +" is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    private static boolean checker(String str) {
        
        String myString = str.toLowerCase();
        
        int length = myString.length();
        for (int i = 0; i < length / 2; i++) {
            if (myString.charAt(i) != myString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
