public class Solution {
    public int[] twoSum(int[] numbers, int target) {
 		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 		int[] res = new int[2];
 		for(int i=0;i<numbers.length;i++) {
 			if(map.containsKey(numbers[i])) {
 				res[0] = map.get(numbers[i]);
 				res[1] = i + 1;
 				break;
 			}
 			else
 				map.put(targer - numbers[i], i+1);
 		}

 		return res;     
    }
}