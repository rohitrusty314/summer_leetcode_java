public class Solution {
    public int findComplement(int num) {
        int p = 0;
        int comp = 0;
        while(num != 0){
        	if(num%2 == 0)
        		comp += Math.pow(2,p);
        	p++;
        	num = num/2;
        }

        //System.out.println(comp);
        return comp;
    }
}