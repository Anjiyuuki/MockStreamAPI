import java.util.Scanner;
// Write a Java program to implement the binary search algorithm for a sorted array.
public class Q13 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.print("Enter the number to search for: ");
        int num = scanner.nextInt();

        int result = binarySearch(array, num);

        if (result == -1) {
            System.out.println("number not found in the array.");
        } else {
            System.out.println("number found at index: " + result);
        }

        scanner.close();
    }

 
    public static int binarySearch(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

           
            if (array[mid] == num) {
                return mid;
            }

            if (array[mid] < num) {
                left = mid + 1;
            }
           
            else {
                right = mid - 1;
            }
        }
        // If reach here, then the element not present
        return -1;
    }

}
