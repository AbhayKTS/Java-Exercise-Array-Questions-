/*
 Exercise 3: Sorted Set
Store student names in a TreeSet and print them in alphabetical order.
 */
public class SortedSet {
    public static void main(String[] args) {
        java.util.TreeSet<String> students = new java.util.TreeSet<>();
        students.add("John");
        students.add("Alice");
        students.add("Bob");
        students.add("Diana");
        System.out.println("Students in alphabetical order: " + students);
    }
}
