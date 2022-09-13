package algorithms.longestsubstring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<String> list = new ArrayList();

        String tmp = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (tmp.indexOf(chars[i]) != -1) {
                list.add(tmp);
                tmp = "";
                //i-=1;
                if (chars[i - 1] != chars[i])
                    tmp += chars[i - 1];

                tmp += chars[i];
            } else
                tmp += chars[i];
        }
        if (!tmp.isEmpty())
            list.add(tmp);

        Optional<String> longest = list.stream().sorted((e1, e2) -> e1.length() > e2.length() ? -1 : 1).findFirst();
        if (longest.isPresent())
            return longest.get().length();
        else
            return 0;
    }
}
