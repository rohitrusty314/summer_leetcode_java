public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0;i<list1.length;i++) 
        	map.put(list1[i], i);

        int least_index_sum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<String>();

        for(int i=0; i<list2.length;i++) {
        	if(map.containsKey(list2[i])) {
        		int ind_sum = i + map.get(list2[i]);
        		if(ind_sum <= least_index_sum) {
        			if(ind_sum < least_index_sum && result.size() > 0) 
        				result.clear();
        			least_index_sum = ind_sum;
        			result.add(list2[i]);
        		}
        	}
        }

        return result.toArray(new String[result.size()]);
    }
}