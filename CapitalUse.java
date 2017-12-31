public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allCapital = checkAllCapital(word);
        boolean allSmall = checkAllSmall(word);
        boolean firstLetterCapital = checkFirstLetterCapital(word);



        return allCapital || allSmall || firstLetterCapital;
    }

    private boolean checkAllCapital(String word) {
    	for(int i=0;i<word.length;i++) {
    		char ch = word.charAt(i);
    		if(ch < 65 || ch > 90) return false;
    	}

    	return true;
    }

    private boolean checkAllSmall(String word) {
    	for(int i=0;i<word.length;i++) {
    		char ch = word.charAt(i);
    		if(ch < 97 || ch > 122) return false;
    	}

    	return true;
    }

    //the given string is non-empty
    private boolean checkFirstLetterCapital(String word) {
    	char firstLetter = word.charAt(0);
    	boolean validUse = false;

    	//If the first letter is uppercase
    	//this is a valid scenario
    	if(firstLetter >= 65 && firstLetter <= 90) 
    		validUse = true;
    	//check for rest of the letters to be lowercase
    	for(int i=1; i<word.length(); i++) {
    		if(ch < 97 || ch > 122) {
    			//Non-lowercase letter encountered
    			validUse = false;
    			break;
    		}
    	}

    	return validUse;
    }

}