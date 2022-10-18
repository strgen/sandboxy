package algorithms.issubsequence;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void testSolution(){
        Solution solution = new Solution();
        var res = solution.isSubsequence("abc", "ahbgdc");
        assert res;
    }

    @Test
    void testSolution1(){
        Solution solution = new Solution();
        var res = solution.isSubsequence("axc", "ahbgdc");
        assert !res;
    }
}
