package algorithms.recursion1.searchBST;

import org.junit.Test;

import java.io.File;
import java.net.URL;

public class SolutionTest {
    @Test
    public void testSolution(){

        Solution.TreeNode treeNode = new Solution.TreeNode(18);
        treeNode.left = new Solution.TreeNode(2);
        treeNode.right = new Solution.TreeNode(22);
        treeNode.right.right = new Solution.TreeNode(63);
        treeNode.right.left = new Solution.TreeNode(0);
        treeNode.right.right.right = new Solution.TreeNode(84);

        Solution solution = new Solution();
        Solution.TreeNode node = solution.searchBST(treeNode, 63);
        if(node == null)
            System.out.println("null");
        else {
            System.out.println( node.val );
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
