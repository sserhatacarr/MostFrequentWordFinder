# Most Frequent Word Finder

This Java program takes user input for a text, splits the text into words, and then finds the most frequently occurring word.

## How to Use

1. Run the program.
2. Enter a text when prompted.
3. The program will output the most frequently occurring word in the provided text.

## Method Overview

### `getInput()`

Takes input from the user.

### `splitIntoWords(String text)`

Splits the given text into words.

### `findMostFrequentWord(String[] words)`

Finds the most frequently occurring word in the given array of words.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        MostFrequentWordFinder wordFinder = new MostFrequentWordFinder();
        String text = MostFrequentWordFinder.getInput();
        String[] words = MostFrequentWordFinder.splitIntoWords(text);

        String mostFrequentWord = MostFrequentWordFinder.findMostFrequentWord(words);

        System.out.println("The most frequent word: " + mostFrequentWord);
    }
}
```
