class Solution {
    public int singleNumber(int[] nums) {
        // the XOR operation of 2 same numbers equals 0
        int ans =0;
        for(int i : nums){
            ans^=i;
        }
        return ans;
    }
}