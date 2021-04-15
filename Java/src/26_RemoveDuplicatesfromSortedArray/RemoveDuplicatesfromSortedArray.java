class Solution {
    public int removeDuplicates(int[] nums) {

        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[ans++] = nums[i];
            }
        }
        return ans;
    }
}