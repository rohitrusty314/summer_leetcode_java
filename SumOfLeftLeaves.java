/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root != null) {
        	if(root.left != null && root.left.left == null && root.left.right == null) 
        		sum += root.left.val;
        	sumOfLeftLeaves(root.left);
        	sumOfLeftLeaves(root.right);
        }

        return sum;
    }
}