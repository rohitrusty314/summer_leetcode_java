public class Solution {
    public boolean judgeCircle(String moves) {
        int[] location = {0,0};

        for(int i=0;i<moves.length(); i++) {
            switch(moves.charAt(i)) {
                case 'U': location[1]++;
                          break;
                case 'D': location[1]--;
                          break;
                case 'L': location[0]++;
                          break;
                case 'R': locatioin[0]--;
                          break;
            }
        }

        if(location[0] == 0 && location[1] == 0) return true;
        return false;
    }
}