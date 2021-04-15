class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int ans[] = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            } else if (numbers[i] + numbers[j] > target)
                j--;
            else
                i++;
        }
        return ans;
    }
}