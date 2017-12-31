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
	private HashSet<Integer> diff = new HashSet<Integer>();

    public boolean findTarget(TreeNode root, int k) {
        if(root != null) {
        	int cur = root.val;
        	if(diff.contains(cur)) return true;
        	diff.add(k - cur);
        	
        	boolean inLeft = findTarget(root.left, k);
        	boolean inRight = findTarger(root.right, k);

        	return(inLeft || inRight);
        }

        return false;
    }
}