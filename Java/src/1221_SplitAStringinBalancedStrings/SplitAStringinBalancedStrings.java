class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int val = 0;
        for (char c : s.toCharArray()) {
            if(c == 'L')
                val--;
            else
                val++;
            if (val == 0)
                    ans++;
        }
        return ans;
    }
}