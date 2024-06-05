import java.util.Scanner;
// Write a Java program to create a simple calculator using switch case statements.
public class Q12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Calculator");

	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	       
	        System.out.print("Enter operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	     
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        double result = 0;
	        boolean valid = true;

	        
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    valid = false;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator.");
	                valid = false;
	        }

	       
	        if (valid) {
	            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	        }

	        scanner.close();
	    
	}

}
