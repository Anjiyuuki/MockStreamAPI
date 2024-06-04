// Write a Java program that uses the Stream API to find all distinct strings in a list, ignoring case sensitivity.





import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;





public class Q19 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("angie", "ANGIE", "max", "MAX", "Albert", "ALBERT");

        
        List<String> distinctStrings = strings.stream()
                                              .map(String::toLowerCase) 
                                              .distinct()                  
                                              .collect(Collectors.toList());

System.out.println("Distinct strings: " + distinctStrings);

	}

}
