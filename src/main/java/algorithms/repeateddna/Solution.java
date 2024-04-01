package algorithms.repeateddna;

import java.util.*;

public class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> res = new HashSet<>();
        HashMap<String, Integer> matches = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            var sub = s.substring(i, i + 10);
            if (matches.putIfAbsent(sub, 1) == null) {
                continue;
            }
            if (matches.containsKey(sub)) {
                res.add(sub);
            }
        }
        return new ArrayList<>(res);
    }

}