/*Exercise 10: Matrix Diagonal Sum 
A slightly advanced exercise. 
Task 
1. Create a 3x3 matrix. 
2. Fill it with numbers 1–9. 
3. Find the sum of the primary diagonal. 
4. Find the sum of the secondary diagonal.
*/ 
public class exercise10 {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int pds = 0;
        int sds = 0;
        for (int i = 0; i < 3; i++) {
            pds += m[i][i];
            sds += m[i][2 - i];
        }
        System.out.println("Primary Diagonal Sum: " + pds);
        System.out.println("Secondary Diagonal Sum: " + sds);
    }
}
