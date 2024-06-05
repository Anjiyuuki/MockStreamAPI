//Write a Java program to check whether a year is a leap year or not.

import java.util.Scanner;

public class Q6 {
	 private static boolean LeapYear(int year) {

	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                return year % 400 == 0;
	            } else {
	                return true;
	            }
	        } else {
	            return false;
	        }
	    }
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year to check if it is a leap year: ");
	        int year = scanner.nextInt();
	        scanner.close();

	        if (LeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	}

}
