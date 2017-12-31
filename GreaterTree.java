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
	private int treeSum = 0;


    public TreeNode convertBST(TreeNode root) {
    	makeGTree(root);
    	return root;
    }

    private void  makeGTree(TreeNode root) {
    	if(root != null) {
    		makeGTree(root.right);
    		root.val += treeSum;
    		treeSum = root.val;
    		makeGTree(root.left);
    	}
    	return root;
    }