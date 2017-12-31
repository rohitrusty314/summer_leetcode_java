class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     	Arrays.sort(nums1);
     	Arrays.sort(nums2);

     	List<Integer> result = new ArrayList<Integer>();

     	for(int i=0, j=0;i<nums1.length && nums2.length;) {
     		if(nums1[i] == nums2[j]) {
     			result.add(nums1[i])
     			i++;
     			j++;
     		}

     		else if(nums1[i] < nums2[j]) i++;
     		else if(nums2[j] < nums1[i]) j++;
     	}

     	return result.toArray(new int[result.size()]);   
    }
}