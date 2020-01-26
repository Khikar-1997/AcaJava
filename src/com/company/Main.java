package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] wordArray = text.split(" ");
        for (String word : wordArray) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> textWords = wordCount.keySet();
        Iterator<String> itr = textWords.iterator();

        while(itr.hasNext())
        {
            String word = itr.next();

            if (wordCount.get(word) == 1)
                System.out.print(word + " ");
        }
    }
}
