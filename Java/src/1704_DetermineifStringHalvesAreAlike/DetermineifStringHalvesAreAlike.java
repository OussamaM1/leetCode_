class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int countA = 0, countB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'u' || s.charAt(i) == 'o') {
                if (i < (s.length() / 2))
                    countA++;
                else
                    countB++;
            }
        }

        return countA == countB;
    }
}
