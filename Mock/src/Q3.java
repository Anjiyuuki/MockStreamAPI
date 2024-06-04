import java.util.Arrays;
import java.util.List;


// Write a Java program that uses the Stream API to find the sum of all elements in a list of integers.
public class Q3 {

	public static void main(String[] args) {
		 List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
	        int sum = num.stream()
	                         .mapToInt(Integer::intValue)
	                         .sum();
	        System.out.println("Sum: " + sum);
	}

}
