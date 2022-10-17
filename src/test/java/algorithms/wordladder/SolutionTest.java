package algorithms.wordladder;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution(){
        Solution solution = new Solution();

        var res = solution.ladderLength("hit", "cog",
                List.of("hot", "dot", "dog", "lot", "log", "cog"));
        assert res == 5;
    }

    @Test
    public void testSolution2(){
        Solution solution = new Solution();

        var res = solution.ladderLength("a", "c",
                List.of("a", "b", "c"));
        assert res == 2;
    }

}
