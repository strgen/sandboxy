package algorithms.twosums;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSolution {
    @Test
    public void testSolution(){
        int[] input = { 3, 2, 4};
        Solution solution = new Solution();
        Arrays.stream(solution.twoSum(input, 6)).forEach(x-> System.out.println(x));
    }
}
