package algorithms.twosums;

import org.junit.Test;

import java.util.Arrays;

public class TestSolution {
    @Test
    public void testSolution(){
        //int[] input = { 2,7,11,15};
        int[] input = { 3, 2, 4};
        Solution solution = new Solution();
        Arrays.stream(solution.twoSum(input, 6)).forEach(x-> System.out.println(x));
    }
}
