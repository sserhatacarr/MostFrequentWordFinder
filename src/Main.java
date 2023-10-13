public class Main {
    public static void main(String[] args) {
        MostFrequentWordFinder wordFinder = new MostFrequentWordFinder();
        String text = MostFrequentWordFinder.getInput();
        String[] words = MostFrequentWordFinder.splitIntoWords(text);

        String mostFrequentWord = MostFrequentWordFinder.findMostFrequentWord(words);

        System.out.println("The most frequent word: " + mostFrequentWord );
    }
}