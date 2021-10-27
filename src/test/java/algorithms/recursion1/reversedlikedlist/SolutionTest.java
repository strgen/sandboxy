package algorithms.recursion1.reversedlikedlist;

import org.junit.Test;
import algorithms.recursion1.reversedlinkedlist.Solution;

import java.io.*;
import java.net.URL;

public class SolutionTest {
    @Test
    public void testSolution(){

        Solution solution = new Solution();
        Solution.ListNode listNode = new Solution.ListNode(1);

        Solution.ListNode next = new Solution.ListNode(2);
        listNode.next = next;
        for(int i = 3; i < 6; i++){
            next.next = new Solution.ListNode(i);
            next = next.next;
        }
        solution.reverseList(listNode);
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
