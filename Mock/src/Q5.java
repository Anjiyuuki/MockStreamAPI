import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Write a Java program that uses the Stream API to filter a list of strings that start with the letter "A" and collect them into a list.
public class Q5 {
public static void main(String[] args) {
	 List<String> strings = Arrays.asList("Angie", "bob", "Albert", "crystal");
     List<String> filtered = strings.stream()
                                    .filter(s -> s.startsWith("A"))
                                    .collect(Collectors.toList());
     System.out.println(filtered);
}
}
