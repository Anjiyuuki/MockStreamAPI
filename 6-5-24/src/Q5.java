import java.util.Scanner;

public class Q5 {
// Write a Java program to reverse a string.
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String originalString = input.nextLine();
        input.close();

        String reversedString = reverseString(originalString);
        System.out.println("Reversed string: " + reversedString);
    }

    private static String reverseString(String input) {
        char[] chars = new char[input.length()];
        for (int index = 0; index < input.length(); index++) {
            chars[index] = input.charAt(index);
        }

        for (int leftIndex = 0, rightIndex = chars.length - 1; leftIndex < rightIndex; leftIndex++, rightIndex--) {
            char tempChar = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = tempChar;
        }

        String result = "";
        for (int index = 0; index < chars.length; index++) {
            result += chars[index];
        }

        return result;
    }

    

}
