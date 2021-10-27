package algorithms.recursion1;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class Solution {
    public int openLock(String[] deadends, String target) {
        String start = "0000";
        Set<String> dead = new HashSet();
        for (String d : deadends) dead.add(d);
        if (dead.contains(start)) return -1;

        Queue<String> queue = new LinkedList();
        queue.add(start);

        Set<String> visited = new HashSet();
        visited.add(start);

        int steps = 0;
        while (!queue.isEmpty()) {
            ++steps;
            int size = queue.size();
            AtomicBoolean finish = new AtomicBoolean(false);
            IntStream.range(0, size).forEach(
                    x -> {
                        String node = queue.poll();
                        IntStream.range(0, 4)
                                .forEach(column -> IntStream.iterate(-1, it -> it + 2).limit(2).
                                        forEach(offset -> {
                                                    char[] combChr = node.toCharArray();
                                                    char baseChar = combChr[column];
                                                    if (offset == -1)
                                                        combChr[column] = down(baseChar);
                                                    else
                                                        combChr[column] = up(baseChar);
                                                    String newComb = String.valueOf(combChr);
                                                    if (newComb.equals(target)) finish.set(true);

                                                    if (!dead.contains(newComb) && !visited.contains(newComb)) {
                                                        visited.add(newComb);
                                                        queue.offer(newComb);
                                                    }
                                                }
                                        )
                                );
                    }
            );

            if (finish.get()) {
                return steps;
            }
        }
        return -1;
    }

    public char up(char n) {
        if (n == '9')
            return '0';
        return String.valueOf(Character.getNumericValue(n) + 1).charAt(0);
    }

    public char down(char n) {
        if (n == '0')
            return '9';
        return String.valueOf(Character.getNumericValue(n) - 1).charAt(0);
    }
}