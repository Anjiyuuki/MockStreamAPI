//Write a Java program that uses the Stream API to generate an infinite stream of integers starting from 1 and find the first prime number. 
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Q17 {

	public static void main(String[] args) {
		 List<Integer> primes = Stream.iterate(2, n -> n + 1) // Start from 2
                 .filter(Q17::isPrime)
                 .limit(10)
                 .collect(Collectors.toList());



System.out.println("The Prime num is: " + primes);
	}

	private static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;

	}

}
