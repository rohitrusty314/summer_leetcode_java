public class Solution {
    public int distributeCandies(int[] candies) {
        int max_candies = candies.length/2;

        HashSet<Integer> diff_candies = new HashSet<Integer>();

        for(int i=0; i<candies.length; i++) {
        	diff_candies.add(candies[i]);
            if(diff_candies.size() >= max_candies) break;
        }

        return Math.min(max_candies, diff_candies.size());
    }
}