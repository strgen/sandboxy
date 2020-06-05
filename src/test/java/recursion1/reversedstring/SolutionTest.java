package recursion1.reversedstring;

import org.junit.Test;

import java.io.File;
import java.net.URL;

public class SolutionTest {
    @Test
    public void testSolution(){

        String hello = "hannah";
        //["H","a","n","n","a","h"]
        Solution solution = new Solution();
        solution.reverseString(hello.toCharArray());

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
