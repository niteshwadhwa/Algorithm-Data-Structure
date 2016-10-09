public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int product = 1;
        for(int i=0;i<arr.length;i++){
            arr[i] = product;
            product = product * nums[i];
        }
        product = 1;
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = arr[i]*product;
            product = product*nums[i];
        }
        return arr;
    }
}