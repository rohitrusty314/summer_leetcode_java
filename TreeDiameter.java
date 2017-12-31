/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
    
        if(root != null) {
            int left = diameterOfBinaryTree(root.left);
            int right = diameterOfBinaryTree(root.right);
            System.out.println(left +" - " + right);
            return left + right + 1;
        }   
        return 0;
    }
}