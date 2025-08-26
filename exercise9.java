/*
Exercise 9: Reverse an Array 
A classic array manipulation task. 
Task 
1. Create an array {1, 2, 3, 4, 5}. 
2. Write a method to reverse it in-place. 
3. Print original and reversed arrays. 
*/
public class exercise9 {
    public static void reverseArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(arr);

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}