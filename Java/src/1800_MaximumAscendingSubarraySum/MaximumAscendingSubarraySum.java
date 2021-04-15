class Solution {
    public int maxAscendingSum(int[] nums) {
        int count=0;
        int ans = 0;
        for (int i = 0 ;i< nums.length ; i++){
            count = nums[i];
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[j-1] < nums[j])
                    count+=nums[j];
                else
                    break;
            }
            ans = Math.max(ans , count);
        }
        return ans;
    }
}