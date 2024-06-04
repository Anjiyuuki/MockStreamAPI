// Write a Java program that uses the Stream API to skip the first 5 elements of a list and then collect the next 5 elements.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q18 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        
        List<Integer> result = num.stream()
                                      .skip(5)      // Skip the first 5 elements
                                      .limit(5)     // Limit to the next 5 elements
                                      .collect(Collectors.toList());

    
        System.out.println("Result: " + result);

	}

}
