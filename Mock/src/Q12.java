import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Write a Java program that uses the Stream API to join a list of strings with a comma separator.
public class Q12 {

	public static void main(String[] args) {
		 List<String> strings = Arrays.asList("apple", "banana", "cherry");
	        String join = strings.stream()
	                               .collect(Collectors.joining(", "));
	        System.out.println(join);
	}

}
