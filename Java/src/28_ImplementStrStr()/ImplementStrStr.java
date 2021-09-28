class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        if (haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return -1;
    }
}