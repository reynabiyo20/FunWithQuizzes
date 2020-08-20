package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String quote = input.nextLine();

        char[] charactersInQuote = quote.toLowerCase().toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char temp : charactersInQuote) {
            if (Character.isAlphabetic(temp)) {
                if (characterCount.containsKey(temp)) {
                    characterCount.put(temp, characterCount.get(temp) + 1);
                } else {
                    characterCount.put(temp, 1);
                }
            }
            for (Map.Entry<Character, Integer> display : characterCount.entrySet()) {
                System.out.println(display.getKey() + ": " + display.getValue());
            }
        }
    }
}
