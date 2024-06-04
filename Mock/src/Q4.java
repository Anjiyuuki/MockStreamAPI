import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
// Write a Java program that uses the Stream API to collect all distinct elements from a list of integers into a set.
public class Q4 {

	public static void main(String[] args) {
		 List<Integer> num = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
	        Set<Integer> dis = num.stream()
	                                  .collect(Collectors.toSet());
	        System.out.println(dis);

	}

}
