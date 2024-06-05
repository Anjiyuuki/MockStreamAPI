import java.util.Scanner;

public class Q1 {

	//Write a Java program to find the factorial of a given number.
	
	
 public static long calculate(int n) {
	        long result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0) {
            System.out.println("Must enter positive number.");
        } else {
            long fac = calculate(num);
            System.out.println("Factorial of " + num + " is: " + fac);
        }

	}

}
