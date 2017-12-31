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
	public int findTilt(TreeNode root) {
		return finding(root, "")[0];
	}

    public int[] finding(TreeNode root, String side) {
        int[] wholes = new int[2];
        
        if(root != null) {
        	int[] lefts = finding(root.left, "LEFT");
        	int[] rights = finding(root.right, "RIGHT");

        	wholes[0] = lefts[0] + rights[0] + Math.abs(lefts[1] - rights[1]);
            
        	if(side.equals("LEFT")) {
        		lefts[1] += root.val + rights[1]; wholes[1] = lefts[1];
        	}
        	if(side.equals("RIGHT")) {
        		rights[1] += root.val + lefts[1]; wholes[1] = rights[1];
        	}
        }
        
        return wholes;
    }
}