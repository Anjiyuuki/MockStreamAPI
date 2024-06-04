
// Write a Java program that uses the Stream API to convert a list of strings to uppercase.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("angie", "cat", "bob");
        List<String> up = strings.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        System.out.println(up);
    }
	}


