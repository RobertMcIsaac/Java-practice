import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String input = "the cat in the hat";

        countWords(input);
//        System.out.println(countWords(input));
    }

    public static void countWords(String words) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] splitString = words.split(" ");

        for (String word: splitString) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> entry: wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
