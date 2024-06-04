import java.util.ArrayList;
import java.util.List;
import java.util.Random; 

// Write a Java program that uses the Stream API to generate a stream of 10 random integers.
public class Q15 {

	public static void main(String[] args) {
		 Random random = new Random();
	        int[] randomIntegers = random.ints(10, 1, 101)
	                                      .toArray();      // Collect into an int array

	        System.out.println("Random Integers:");
	        for (int num : randomIntegers) {
	            System.out.println(num);
	        }
	}

}
