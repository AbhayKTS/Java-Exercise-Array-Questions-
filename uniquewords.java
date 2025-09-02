/*
 Exercise 1: Unique Words (Set)
Take a sentence and use a HashSet<String> to print all unique words.
 */
public class uniquewords{
    public static void main(String[] args) {
        String sentence = "This is a test. This test is only a test.";
        String[] words = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        java.util.HashSet<String> uniqueWords = new java.util.HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println("Unique words: " + uniqueWords);
    }
}
