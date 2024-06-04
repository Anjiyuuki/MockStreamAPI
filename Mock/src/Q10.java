import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Write a Java program that uses the Stream API to group a list of Person objects by age.

public class Q10 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
                new Person("Angie", 30),
                new Person("Bob", 20),
                new Person("Chester", 34),
                new Person("David", 22)
        );
        Map<Integer, List<Person>> groupedByAge = people.stream()
                                                        .collect(Collectors.groupingBy(p -> p.age));
        System.out.println(groupedByAge);
	}

}
