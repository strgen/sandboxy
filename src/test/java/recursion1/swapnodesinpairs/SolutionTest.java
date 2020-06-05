package recursion1.swapnodesinpairs;

import org.junit.Test;

import java.io.File;
import java.net.URL;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution.ListNode head = new Solution.ListNode(1);
        head.next =  new Solution.ListNode(2);
        head.next.next =  new Solution.ListNode(3);
        head.next.next.next =  new Solution.ListNode(4);
        Solution solution = new Solution();
        solution.swapPairs(head);

        while(head != null){
            System.out.println(head.val);
            head = head.next;
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
