package algorithms.containerwithmostwater;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int maxArea(int[] h) {

        int li = 0, ri = h.length -1;
        int mA = 0;

        while (li < ri) {
            mA = Math.max(mA, Math.min(h[li], h[ri]) * (ri - li));

            if(h[li] < h[ri])
                li += 1;
            else
                ri -= 1;
        }
        return mA;
    }
}
