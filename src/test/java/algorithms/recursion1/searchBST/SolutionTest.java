package algorithms.recursion1.searchBST;

import org.junit.Test;

import java.io.File;
import java.net.URL;

public class SolutionTest {
    @Test
    public void testSolution(){

        /*algorithms.recursion1.Solution.TreeNode treeNode = new algorithms.recursion1.Solution.TreeNode(4);
        treeNode.left = new algorithms.recursion1.Solution.TreeNode(2);
        treeNode.right = new algorithms.recursion1.Solution.TreeNode(7);

        treeNode.left.left = new algorithms.recursion1.Solution.TreeNode(1);
        treeNode.left.right = new algorithms.recursion1.Solution.TreeNode(3);*/
        Solution.TreeNode treeNode = new Solution.TreeNode(18);
        treeNode.left = new Solution.TreeNode(2);
        treeNode.right = new Solution.TreeNode(22);
        treeNode.right.right = new Solution.TreeNode(63);
        treeNode.right.right.right = new Solution.TreeNode(84);

        Solution solution = new Solution();
        //algorithms.recursion1.Solution.TreeNode node = solution.searchBST(treeNode, 2);
        Solution.TreeNode node = solution.searchBST(treeNode, 63);
        if(node == null)
            System.out.println("null");
        else {
            System.out.println( node.val );
            //System.out.println( node.left.val + " " + node.right.val);
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
