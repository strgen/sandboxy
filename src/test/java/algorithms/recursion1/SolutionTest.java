package algorithms.recursion1;

import org.junit.Test;

import java.io.*;
import java.net.URL;

public class SolutionTest {
    @Test
    public void testSolution(){

        String[] deadends = null;
        String target = null;
        File file = getFileFromResources("input");

        if (file == null) return;

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                if(line.contains("deadends")){
                    deadends= line.split("=")[1].split(",");
                }
                if(line.contains("target")){
                    target = line.split("=")[1];
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(deadends != null && target != null) {
            Solution solution = new Solution();
            System.out.println("steps = " + solution.openLock(deadends, target));
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
