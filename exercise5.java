import java.util.Arrays;

public class exercise5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] c=arr;// c is pointing to arr
        int[] brr=Arrays.copyOf(arr,arr.length);
        c[0]=5;// by modifying c we are also modifying arr as c is pointing to arr
        System.out.println("original "+Arrays.toString(arr));
        System.out.println("with copyof "+Arrays.toString(brr));
        System.out.println("c pointing a and modified "+Arrays.toString(c));
    }
}
