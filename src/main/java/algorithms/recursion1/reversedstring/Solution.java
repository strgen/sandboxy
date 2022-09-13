package algorithms.recursion1.reversedstring;

public class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
        System.out.println(s);
    }

    public void reverse(char[] s, int start, int end) {
        boolean finish = s.length % 2 == 0 ? start - 1 == end : start == end;
        if (finish)
            return;
        s[start] = (char) (s[start] + s[end]);
        s[end] = (char) (s[start] - s[end]);
        s[start] = (char) (s[start] - s[end]);
        reverse(s, start + 1, end - 1);
    }
}