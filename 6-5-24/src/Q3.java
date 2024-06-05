import java.util.Scanner;

public class Q3 {
// Write a Java program to print the Fibonacci series up to a given number.
	

	    private static void calculate(int number) {
	        int start = 0, next = 1;
	        System.out.print(start + " " + next);

	        int total;
	        while (true) {
	            total = start + next;
	            if (total > number) {
	                break;
	            }
	            System.out.print(" " + total);
	            start = next;
	            next = total;
	        }
	        System.out.println();
	    }
	    
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to generate the Fibonacci series up to: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        System.out.println("Fibonacci series up to " + number + ":");
	        calculate(number);
	    }
	    
	    

}
