package algorithms.twosums;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        /*
            [2,7,11,15]
            9
            public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
        */
        Map<Integer, Integer> diff = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if( diff.containsKey(complement) ){
                return new int[]{ diff.get(complement), i };
            }
            diff.put(nums[ i ], i);
        }

        throw new IllegalArgumentException("no solution");
    }
}
