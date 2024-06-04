import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
// Write a Java program that uses the Stream API to flatten a list of lists of integers into a single list of integers.
public class Q13 {

	public static void main(String[] args) {
	
		 List<List<Integer>> listOfLists = new ArrayList<>();
	        listOfLists.add(List.of(1, 2, 3));
	        listOfLists.add(List.of(4, 5));
	        listOfLists.add(List.of(6, 7, 8, 9));

	       
	        List<Integer> result = listOfLists.stream()
	                .flatMap(List::stream)
	                .collect(Collectors.toList());

	      
	        System.out.println("Flattened list: " + result);
        
        

	}

}
