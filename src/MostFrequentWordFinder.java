import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentWordFinder {

    //  Takes input from the user.
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        return scanner.nextLine();
    }

    // The text to be split into words.
    public static String[] splitIntoWords(String text) {
        return text.split("\\s+");
    }
    //  Finds the most frequently occurring word in the given array of words.
    public static String findMostFrequentWord(String[] words) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        String mostFrequentWord = "";
        int maxCount = 0;

        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count > maxCount) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }
        return mostFrequentWord + " (appeared " + maxCount + " times)";
    }
}


