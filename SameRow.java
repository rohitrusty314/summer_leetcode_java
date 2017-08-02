public class Solution {
	private static HashMap<Character, Integer> ROW_LIST = new HashMap<Character, Integer>();

	static{
		ROW_LIST.put('q', 0);
		ROW_LIST.put('w', 0);
		ROW_LIST.put('e', 0);
		ROW_LIST.put('r', 0);
		ROW_LIST.put('t', 0);
		ROW_LIST.put('y', 0);
		ROW_LIST.put('u', 0);
		ROW_LIST.put('i', 0);
		ROW_LIST.put('o', 0);
		ROW_LIST.put('p', 0);
        
        ROW_LIST.put('Q', 0);
		ROW_LIST.put('W', 0);
		ROW_LIST.put('E', 0);
		ROW_LIST.put('R', 0);
		ROW_LIST.put('T', 0);
		ROW_LIST.put('Y', 0);
		ROW_LIST.put('U', 0);
		ROW_LIST.put('I', 0);
		ROW_LIST.put('O', 0);
		ROW_LIST.put('P', 0);
        
		ROW_LIST.put('a', 1);
		ROW_LIST.put('s', 1);
		ROW_LIST.put('d', 1);
		ROW_LIST.put('f', 1);
		ROW_LIST.put('g', 1);
		ROW_LIST.put('h', 1);
		ROW_LIST.put('j', 1);
		ROW_LIST.put('k', 1);
		ROW_LIST.put('l', 1);
        
        ROW_LIST.put('A', 1);
		ROW_LIST.put('S', 1);
		ROW_LIST.put('D', 1);
		ROW_LIST.put('F', 1);
		ROW_LIST.put('G', 1);
		ROW_LIST.put('H', 1);
		ROW_LIST.put('J', 1);
		ROW_LIST.put('K', 1);
		ROW_LIST.put('L', 1);
        
		ROW_LIST.put('z', 2);
		ROW_LIST.put('x', 2);
		ROW_LIST.put('c', 2);
		ROW_LIST.put('v', 2);
		ROW_LIST.put('b', 2);
		ROW_LIST.put('n', 2);
		ROW_LIST.put('m', 2);
        
        ROW_LIST.put('Z', 2);
		ROW_LIST.put('X', 2);
		ROW_LIST.put('C', 2);
		ROW_LIST.put('V', 2);
		ROW_LIST.put('B', 2);
		ROW_LIST.put('N', 2);
		ROW_LIST.put('M', 2);
	}

    public String[] findWords(String[] words) {
 		List<String> resWords = new ArrayList<String>();

        for(int i=0, j=0; i<words.length; i++){
        	if(sameRow(words[i])) resWords.add(words[i]);
        }

        return resWords.toArray(new String[resWords.size()]);
    }

    private boolean sameRow(String word) {
    	int len = word.length();
    	if(len == 0) return false;
        
    	int row = ROW_LIST.get(word.charAt(0));

    	for(int i=1; i<len; i++) {
    		if(ROW_LIST.get(word.charAt(i)) != row) return false;
    	}

    	return true;
    }
}