
// Write a Java program that uses a parallel stream to process a large list of integers and find their average.

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q8 {

	public static void main(String[] args) {
		
		 	IntStream large = new Random().ints(1_000_000, 1, 100);

	        
	        double average = large.parallel()
	                                    .average()
	                                    .orElse(0.0); // default if empty

	      
	        System.out.println("Average: " + average);
	}

}
