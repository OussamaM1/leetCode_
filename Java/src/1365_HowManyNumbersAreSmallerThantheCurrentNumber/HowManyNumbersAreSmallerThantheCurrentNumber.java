class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int [nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = 0 ; 
            int currentNumber = nums[i];
            for(int j = 0 ; j < nums.length ; j++){
                if(currentNumber > nums[j]) ans[i]++;
            }
        }
        return ans;
    }
}