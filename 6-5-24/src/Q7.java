// Write a Java program to sort an array of integers using bubble sort.
public class Q7 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
         
            if (!swapped) {
                break;
            }
        }
    }

    
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {36, 10, 25, 12, 22, 56, 77};
        System.out.println("Unsorted array:");
        print(arr);
        
        bubbleSort(arr);
  
        System.out.println("Sorted array:");
        print(arr);
    }

}
