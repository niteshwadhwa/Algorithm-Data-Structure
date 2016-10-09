public class Solution {
    public int[] countBits(int num) {
        int[] arr = new int[num+1];
        arr[0] = 0;
        for(int i=0;i<=num;i++){
           arr[i] = Integer.bitCount(i);
        }
        return arr;
    }
}