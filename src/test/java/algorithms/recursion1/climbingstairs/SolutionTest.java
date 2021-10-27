package algorithms.recursion1.climbingstairs;

import org.junit.Test;

import java.io.File;
import java.net.URL;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(2) );
    }

    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }
}
