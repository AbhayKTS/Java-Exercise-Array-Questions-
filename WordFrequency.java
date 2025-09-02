/*
 Exercise 2: Word Frequency (Map)
Take a paragraph and use HashMap<String,Integer> to count frequency of each word.
 */
public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "This is a test. This test is only a test.";
        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        java.util.HashMap<String, Integer> wordCount = new java.util.HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Frequencies: " + wordCount);
    }
}
