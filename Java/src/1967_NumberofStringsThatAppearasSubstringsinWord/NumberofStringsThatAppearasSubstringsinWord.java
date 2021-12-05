import java.util.regex.Pattern;

class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int ans = 0;

        for (String pattern : patterns) {
            String p = ".*" + pattern + ".*";
            if (Pattern.matches(p, word))
                ans++;

        }

        return ans;

    }
}
