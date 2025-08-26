/*
Exercise 8: Array of Strings 
Bruce often mixes primitives with objects. 
Task 
1. Create an array of String with 5 names. 
2. Write a method findName(String[] arr, String name) that returns true if 
the name exists. 
3. Test it with different names. 
 */
public class exercise8 {
    public static boolean findName(String[] arr, String name) {
        for (String n : arr) {
            if (n.equals(name)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] names = {"bharangar", "yadav", "narayan", "gigras", "bajpai"};
        String nf1 = "yadav";
        String nf2 = "sinsinwar";
        System.out.println("Is " + nf1 + " in the array? " + findName(names, nf1));
        System.out.println("Is " + nf2 + " in the array? " + findName(names, nf2));
    }
}
