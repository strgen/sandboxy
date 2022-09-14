package algorithms.containerwithmostwater;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class SolutionTest {

    @Test
    public void testSolution(){
        Solution solution = new Solution();
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        var result = solution.maxArea(input);
        assert result == 49;
    }

    @Test
    public void testSolution1(){
        Solution solution = new Solution();
        int[] input = {2,1};
        var result = solution.maxArea(input);
        assert result == 1;
    }

    @Test
    public void testSolution2(){
        Solution solution = new Solution();
        int[] input = {1, 1000, 1000, 6, 2, 5, 4, 8, 3, 7};
        var result = solution.maxArea(input);
        assert result == 1000;
    }

    @Test
    public void testSolutionHugeInput() throws IOException {
        InputData inputData = new InputData();
        Solution solution = new Solution();
        var input = inputData.getHugeInput();
        var result = solution.maxArea(input);
        assert result == 701779815;
    }
}
