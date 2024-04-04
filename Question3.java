/*Q3:Write a Java Program to count the number of words in a string using HashMap.*/

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string to count the number of words";
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Display the word count
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}

  
