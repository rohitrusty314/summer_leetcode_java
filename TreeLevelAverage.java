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
	private HashMap<Integer, double[]> levelMap = new HashMap<Integer, double[]>(); 

    public List<Double> averageOfLevels(TreeNode root) {
    	int depth = 0;
        mapToLevels(root, depth);

        List<Double> result = new ArrayList<Double>();
        for(int i= depth; i<levelMap.size(); i++) {
        	result.add(levelMap.get(i)[0]/levelMap.get(i)[1]);
        }

        return result;

    }

    private void mapToLevels(TreeNode root, int depth) {
    	if(root != null ) {
    		if(levelMap.containsKey(depth)) {
    			double[] value = levelMap.get(depth);
    			value[0] += root.val;
    			value[1]++;

    			levelMap.put(depth, value);
    		} else {
    			double[] value = new double[2];
    			value[0] = root.val;
    			value[1] = 1;
    			levelMap.put(depth, value);
    		}

    		mapToLevels(root.left, depth+1);
    		mapToLevels(root.right, depth+1);
    	}
    }
}