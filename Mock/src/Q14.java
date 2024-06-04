import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
// Write a Java program that uses the Stream API to find the average, maximum, and minimum values of a list of integers.
public class Q14 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();

		OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();

		OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
		
		 if (max.isPresent()) {
	            System.out.println("Max: " + max.getAsInt());
	            System.out.println("Average: " + average.getAsDouble());
	        } else {
	            System.out.println("Min: "+ min.getAsInt());
	            System.out.println("Average: " + average.getAsDouble());
	        }
		 
		

	}

}
