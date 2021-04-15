class Solution {
    public int numberOfSteps (int num) {
        int ans = 0 ;
        while(num > 0){
            if(num % 2 == 0){
                ans++;
                num/= 2 ;
            }else {
                ans++;
                num--;
            }
        }
        return ans;
    }
}