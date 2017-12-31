public class Solution {
    public int findLUSlength(String a, String b) {
        
    }
}

/*
Sub-problem
L(i,j) = longest uncommon subsequence at ai and bj

Recurrence relation
L(i,j) 	= 0								at i = 0 and j = 0
		= max{L(i-1, j), L(i, j-1)} 	at ai == bj
		= L(i-1, j-1) + 1				at ai != bj

Solution at:
   L(m,n)


example:
aaxxaax
aaaa
*/