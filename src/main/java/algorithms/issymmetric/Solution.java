package algorithms.issymmetric;

import java.util.ArrayList;
import java.util.List;

/*       1
        / \
       /   \
      2     2
     / \   / \
    3   4 4   3
*/
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return false;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
