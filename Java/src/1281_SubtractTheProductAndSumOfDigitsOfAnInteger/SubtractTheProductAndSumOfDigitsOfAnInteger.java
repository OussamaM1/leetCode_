class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0 ; 
        int product = 1 ; 
        while(n > 0){
            product*= n%10;
            sum += n%10;
            n/= 10;
        }
        return product - sum;
    }
}