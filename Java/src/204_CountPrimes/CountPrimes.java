class Solution {
    public int countPrimes(int n) {
        int ans = 0;
        for (int j = 2; j < n; j++) {
            boolean flag = true;
            for (int i = 2; i * i <= j; i++) {
                if ((j % i) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                ans++;
        }
        return ans;
    }

}