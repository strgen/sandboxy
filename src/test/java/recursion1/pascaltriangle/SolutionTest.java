package recursion1.pascaltriangle;

import org.junit.Test;
import recursion1.pascaltriangle.Solution;

import java.io.File;
import java.net.URL;
import java.util.List;

public class SolutionTest {
    @Test
    public void testSolution(){
        int[] cache = new int[30];
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(0);

        for(Integer val : list){
            System.out.printf(val + " " + cache[1]);
        }
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
