import java.util.ArrayList;

class Solution {
    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int n = nums[i];
            while (n-- > 0) {
                list.add(nums[i + 1]);
            }
        }
        int[] ans = list.stream().mapToInt(i -> i).toArray();
        return ans;

    }
}