import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9 {

// Write a Java program that uses the Stream API to filter a list of Person objects (having fields name and age) to find all people older than 25.	
	
	public static void main(String[] args) {
		 List<Person> people = Arrays.asList(
	                new Person("Angie", 30),
	                new Person("Bella", 20),
	                new Person("Chester", 25),
	                new Person("David", 35)
	        );
	        List<Person> over25 = people.stream()
	                                         .filter(p -> p.age > 25)
	                                         .collect(Collectors.toList());
	        System.out.println(over25);

	}

}
