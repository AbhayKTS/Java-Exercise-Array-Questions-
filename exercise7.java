/*
Exercise 7: Multidimensional Array 
Bruce explains how Java supports 2D arrays. 
Task 
1. Create a 3x3 2D array. 
2. Fill it with multiplication table values (e.g., arr[i][j] = (i+1)*(j+1)). 
3. Print the 2D array in matrix form. 
 */
public class exercise7 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("Multiplication Table:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
