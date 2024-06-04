import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {
//Write a Java program that uses the Stream API to sort a list of strings alphabetically.
	public static void main(String[] args) {
		 List<String> strings = Arrays.asList("banana", "apple", "cherry");
	        List<String> sorted = strings.stream()
	                                     .sorted()
	                                     .collect(Collectors.toList());
	        System.out.println(sorted);
	}

}
