import java.util.Arrays;

// Write a Java program that uses the Stream API to find the maximum value in an array of integers.
public class Q6 {

	public static void main(String[] args) {
		 int[] numbers = {1, 2, 3, 4, 5};
	        int max = Arrays.stream(numbers)
	                        .max()
	                        .getAsInt();
	        System.out.println(max);

	}

}
