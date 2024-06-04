import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Write a Java program that uses the Stream API to print each element of a list of strings before collecting them into a new list.
public class Q16 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("angie", "bob", "sarah", "jim", "michael");

		
		List<String> result = strings.stream().reduce(new ArrayList<>(), (acc, str) -> {
			System.out.println(str); 
			acc.add(str);
			return acc;
		}, (acc1, acc2) -> {
			acc1.addAll(acc2); // combine accumulator
			return acc1;
		});
		
		
		
		List<String> col = result.stream().collect(Collectors.toList());
		System.out.println(col);
		
		
	}
}
