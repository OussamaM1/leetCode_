class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int size = nums.length;
        int positive = 0;
        int negative = 0;
        int ans = 0 ; 
        
        for(int i=0;i< size;i++)
        {
           positive+= nums[i]; 
           negative+= nums[i];
            if(positive<0) positive= 0;
            if(negative>0) negative= 0;
            ans= Math.max(ans,Math.max(positive,-negative));
        }
        
        return ans;
    }   
}