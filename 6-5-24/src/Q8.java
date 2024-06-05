
// Write a Java program to calculate the average grade of students and determine the highest and lowest grades.
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int numStu = scanner.nextInt();

		if (numStu <= 0) {
			System.out.println("Must enter more than 0 student.");
			return;
		}

		int[] grades = new int[numStu];
		int sum = 0;
		int highestGrade = Integer.MIN_VALUE;
		int lowestGrade = Integer.MAX_VALUE;

		for (int i = 0; i < numStu; i++) {
			System.out.print("Enter the grade for student " + (i + 1) + ": ");
			grades[i] = scanner.nextInt();

			sum += grades[i];

			if (grades[i] > highestGrade) {
				highestGrade = grades[i];
			}
			if (grades[i] < lowestGrade) {
				lowestGrade = grades[i];
			}
		}

		double averageGrade = (double) sum / numStu;

		System.out.println("Average grade: " + averageGrade);
		System.out.println("Highest grade: " + highestGrade);
		System.out.println("Lowest grade: " + lowestGrade);

		scanner.close();
	}

}
