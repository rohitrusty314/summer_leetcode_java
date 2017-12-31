public class Solution {
    public int addDigits(int num) {
    	int sum = num;
    	while(sum > 9){
    		sum = 0;
    		num = sum;
    		while(num != 0) {
    			sum += num%10;
    			num = num/10;
    		}
    	}

    	return sum;
    }
}