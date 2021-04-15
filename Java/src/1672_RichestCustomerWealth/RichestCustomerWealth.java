import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < accounts.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < accounts[i].length ; j++){
                sum+= accounts[i][j];
            }
            ans.add(sum);
        }
        return  Collections.max(ans);
    }
}