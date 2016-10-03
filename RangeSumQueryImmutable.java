public class NumArray {

    int[] nums1;

    public NumArray(int[] nums) {
       nums1 = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k=i;k<=j;k++){
            sum = sum+nums1[k];
        }
        return sum;
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);