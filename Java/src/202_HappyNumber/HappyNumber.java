import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> sums = new HashSet<>();
        while (n != 1) {
            n = getSumOfSquaresOfDigits(n);
            if (sums.contains(n))
                return false;
            sums.add(n);
        }
        return true;
    }

    public int getSumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}