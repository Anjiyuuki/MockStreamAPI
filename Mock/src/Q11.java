// Write a Java program that uses the Stream API to partition a list of integers into odd and even numbers.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q11 {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	      
	        List<Integer> evens = numbers.stream()
	                                     .filter(n -> n % 2 == 0)
	                                     .collect(Collectors.toList());

	        List<Integer> odds = numbers.stream()
	                                    .filter(n -> n % 2 != 0)
	                                    .collect(Collectors.toList());

	      System.out.println(odds);
	      System.out.println(evens);

	}

}
