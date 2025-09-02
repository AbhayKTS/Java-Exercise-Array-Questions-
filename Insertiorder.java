/*
 Exercise 4: Insertion Order
Demonstrate the difference between HashSet, LinkedHashSet, and TreeSet using the same input.
 */
public class Insertiorder {
    public static void main(String[] args) {
        String[] items = {"banana", "apple", "orange", "banana", "kiwi", "apple"};

        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();

        for (String item : items) {
            hashSet.add(item);
            linkedHashSet.add(item);
            treeSet.add(item);
        }

        System.out.println("HashSet (no order): " + hashSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        System.out.println("TreeSet (sorted order): " + treeSet);
    }
}