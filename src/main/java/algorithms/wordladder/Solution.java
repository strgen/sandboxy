package algorithms.wordladder;

import java.util.*;


public class Solution {
    private final char[] candidateChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Map.Entry<String, Integer>> queue = new LinkedList<>();
        Set<String> words = new HashSet<>(wordList);

        if (wordList.isEmpty() || !wordList.contains(endWord)) {
            return 0;
        }
        queue.add(Map.entry(beginWord, 1));

        while (!queue.isEmpty()) {
            var entry = queue.poll();
            var wordCharArray = entry.getKey().toCharArray();

            if (entry.getKey().equals(endWord)) {
                return entry.getValue();
            }

            for (int i = 0; i < wordCharArray.length; i++) {
                char temp = wordCharArray[i];
                for (char c : candidateChars) {
                    if (temp == c)
                        continue;
                    wordCharArray[i] = c;
                    var newWord = String.valueOf(wordCharArray);
                    if (words.remove(newWord)) {
                        queue.offer(Map.entry(newWord, entry.getValue() + 1));
                    }
                }
                wordCharArray[i] = temp;
            }

        }
        return 0;
    }
}