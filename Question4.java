/*Q4:Write a Java Program to find the duplicate characters in a string.
  */

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char ch : str.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch));
            }
        }
    }
}
