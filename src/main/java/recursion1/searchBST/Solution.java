package recursion1.searchBST;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null || root.val == val)
            return root;

        return val < root.left.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

     public static class TreeNode {
         public int val;
         public TreeNode left;
         public TreeNode right;

         public TreeNode(int x) {
             val = x;
         }
     }
}