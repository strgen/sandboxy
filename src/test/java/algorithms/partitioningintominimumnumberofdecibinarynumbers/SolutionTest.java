package algorithms.partitioningintominimumnumberofdecibinarynumbers;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void solutionTest(){
        var input = "32";
        Solution solution = new Solution();
        var result = solution.minPartitions(input);
        assert result == 3;
    }
}
