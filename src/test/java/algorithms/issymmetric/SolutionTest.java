package algorithms.issymmetric;

import org.junit.jupiter.api.Test;

import java.util.List;


public class SolutionTest {
    @Test
    void testSolution(){
        Solution.TreeNode treeNode = new Solution.TreeNode();
        //[1,2,2,3,4,4,3]
        treeNode.val = 1;
        treeNode.left = new Solution.TreeNode();
        treeNode.left.val = 2;
        treeNode.right = new Solution.TreeNode();
        treeNode.right.val = 2;
        treeNode.left.left = new Solution.TreeNode();
        treeNode.left.left.val = 3;
        treeNode.left.right = new Solution.TreeNode();
        treeNode.left.right.val = 4;

        treeNode.right.left = new Solution.TreeNode();
        treeNode.right.left.val = 4;
        treeNode.right.right = new Solution.TreeNode();
        treeNode.right.right.val = 3;

        Solution solution = new Solution();
        var res = solution.isSymmetric(treeNode);
        assert res;
    }

    @Test
    void testSolution1(){
        Solution.TreeNode treeNode = new Solution.TreeNode();
        //[1,2,2,null,3,null,3]
        treeNode.val = 1;
        treeNode.left = new Solution.TreeNode();
        treeNode.left.val = 2;
        treeNode.right = new Solution.TreeNode();
        treeNode.right.val = 2;
        treeNode.left.left = null;
        treeNode.left.right = new Solution.TreeNode();
        treeNode.left.right.val = 3;

        treeNode.right.left = null;
        treeNode.right.right = new Solution.TreeNode();
        treeNode.right.right.val = 3;

        Solution solution = new Solution();
        var res = solution.isSymmetric(treeNode);
        assert !res;
    }
}
