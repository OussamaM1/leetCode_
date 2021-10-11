class Solution {
    public int[] getConcatenation(int[] nums) {
        //[1, 2 , 3]
        // the result most be : [1 , 2 , 3 , 1 ,2 , 3]
        
        int ans[] = new int[nums.length*2];
        for(int i= 0; i < nums.length;i++){
                ans[i] = nums[i];
                ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
