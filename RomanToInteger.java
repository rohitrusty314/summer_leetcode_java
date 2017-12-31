class Solution {
	private static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	static {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

    public int romanToInt(String s) {
    	int len = s.length();
    	if(len == 1) return map.get(s.charAt(0));

        int num = 0;
        for(int i=0;i<len;i++) {
        	int d = map.get(s.charAt(i));
        	int d1 = (i<len-1?map.get(s.charAt(i+1)):0);

        	if(d < d1) {
        		num += (d1 - d);
        		i++;
        	} 
        	else num += d;
        }
        
        return num;
    }
}