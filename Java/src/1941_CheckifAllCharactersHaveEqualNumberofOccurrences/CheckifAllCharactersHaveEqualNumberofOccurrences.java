import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character, Integer> hs = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hs.containsKey(s.charAt(i)))
                hs.put(s.charAt(i), 0);
            else {
                int count = hs.get(s.charAt(i));
                hs.put(s.charAt(i), count + 1);
            }
        }

        HashSet<Integer> ans = new HashSet<>();

        for (int counts : hs.values()) {
            ans.add(counts);
        }

        if (ans.size() == 1)
            return true;

        return false;

    }
}
