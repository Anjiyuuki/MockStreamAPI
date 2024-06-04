import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program that uses the Stream API to filter out all even numbers from a list of integers.
public class Q1 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = num.stream()
                                          .filter(n -> n % 2 != 0)
                                          .collect(Collectors.toList());
        System.out.println(oddNumbers);
    }

	}


