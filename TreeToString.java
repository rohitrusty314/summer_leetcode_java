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
    public String tree2str(TreeNode t) {
    	if(t==null) 
            return "";
    	if(t.right == null && t.left == null) 
    		return String.valueOf(t.val);
    	else if(t.left != null && t.right == null)
    		return String.valueOf(t.val) + "("+ tree2str(t.left) + ")";
    	else if(t.left == null && t.right != null)
    		return String.valueOf(t.val) + "()("+ tree2str(t.right) + ")"; 
        else
            return String.valueOf(t.val) + "(" + tree2str(t.left) + ")" + "("+ tree2str(t.right) + ")";
    }
}