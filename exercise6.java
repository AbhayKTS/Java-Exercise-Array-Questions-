/*
Exercise 6: Sorting & Searching 
Using java.util.Arrays. 
Task 
1. Create an array {7, 2, 9, 4, 1}. 
2. Sort it using Arrays.sort(). 
3. Search for 4 using Arrays.binarySearch(). 
4. Print the sorted array and index of 4. 
*/
import java.util.Arrays;

public class exercise6 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1};
        Arrays.parallelSort(arr);
        int n = Arrays.binarySearch(arr, 4);
        System.out.println("Sorted array: " + Arrays.toString(arr)); 
        System.out.println("Index of 4: " + n);
    }
}
