package algorithms.issubsequence;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        var subseq = s.chars().mapToObj( c -> (char) c).collect(Collectors.toList());
        var text = t.toCharArray();

        Queue<Character> queue = new LinkedList<>(subseq);
        int lastPos = 0;
        while (!queue.isEmpty()){
            char c = queue.poll();
            boolean match = false;
            for(int i = lastPos; i < text.length; i++){
                if(c == text[i]){
                    match = true;
                    lastPos = i + 1;
                    break;
                }
            }
            if(!match){
                return false;
            }
        }
        return true;
    }
}
