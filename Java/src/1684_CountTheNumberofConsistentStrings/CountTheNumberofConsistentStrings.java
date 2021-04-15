class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0 ; 
        for (String word: words) {
            for (int i = 0; i < word.length(); i ++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    break;
                } else if (i == word.length() - 1) {
                    ans++;        
                }
            }
        }
        return ans;
    }
}