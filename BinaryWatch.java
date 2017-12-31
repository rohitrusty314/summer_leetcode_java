class Solution {

    private List<String> timesPossible(int hr, int min) {
      String hour = toBinaryString(hr, 4);
      String minutes = toBinaryString(min, 6);

      
      
    }

    private String toBinaryString(int n, int max_bit_size) {
      String ones = StringUtils.repeat("1", n);
      String zeroes = StringUtils.repeat("0", max_bit_size - n);
      return (zeroes+ones);
    }
    
    public List<String> readBinaryWatch(int num) {
        int hr = 0;
        int min = 0;
        List<String> result = new ArrayList<String>();
        
        for(;hr<=num;hr++) {
          min = num - hr;
          result.addAll(timesPossible(hr, min));
        }

        return result;
    }

  
    
}