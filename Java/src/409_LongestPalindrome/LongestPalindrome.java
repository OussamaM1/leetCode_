import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> ans = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (ans.containsKey(s.charAt(i)))
                ans.put(s.charAt(i), ans.get(s.charAt(i)) + 1);
            else
                ans.put(s.charAt(i), 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> m : ans.entrySet()) {
            if ((int) m.getValue() % 2 == 1)
                count++;
        }
        if (count != 0)
            return s.length() - count + 1;
        return s.length();
    }
}