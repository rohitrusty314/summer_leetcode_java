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
	private int depth = 0;

    public int maxDepth(TreeNode root) {
    	int d = 0;
        touchNodesAtEachLevel(root, 0);
        return depth;
    }

    private void touchNodesAtEachLevel(TreeNode root, int d){
    	if(root != null) {
    		depth = Math.max(depth, d);
    		touchNodesAtEachLevel(root.left, d+1);
    		touchNodesAtEachLevel(root.right, d+1);
    	}
    }
}