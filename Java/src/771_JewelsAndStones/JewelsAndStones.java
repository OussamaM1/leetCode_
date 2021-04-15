import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> stone = new HashMap<>();
        char[] str = stones.toCharArray(); 
        for (char c : str) { 
            if (stone.containsKey(c)) { 
                stone.put(c, stone.get(c) + 1); 
            } 
            else { 
                stone.put(c, 1); 
            } 
         }
        int ans = 0;
        char[] strJewels = jewels.toCharArray();
        for(char c : strJewels){
            if (stone.containsKey(c))
             ans+=stone.get(c);
        }
        return ans;
    }
}