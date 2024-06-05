import java.util.Scanner;
// Write a Java program to check whether a number is prime or not.
public class Q2 {

	private static boolean checkPrime(int number) {
        
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { 
                return false; //not prime
            }
        }
        // not divisible , prime
        return true; 
    }
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (checkPrime(num)) {
            System.out.println(num + " is prime number.");
        } else {
            System.out.println(num + " is not prime number.");
        }

	}

}
