import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 1 ; i< candies.length ; i++){
            if(max < candies[i]) max = candies[i];
        }
        ArrayList<Boolean> ans = new ArrayList<>();
        for(int i = 0 ; i < candies.length ; i++){
            if(max <= candies[i]+extraCandies)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}