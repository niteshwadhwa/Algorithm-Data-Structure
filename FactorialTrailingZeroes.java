public class Solution {
    public int trailingZeroes(int n) {
      int s = 0;
      while (n>1) s += (n/=5);
      return s;
        
    }
}