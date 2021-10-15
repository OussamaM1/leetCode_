class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : candyType){
            hs.add(i);
        }
        if(candyType.length / 2 > hs.size()) return hs.size();
        else return candyType.length / 2;
    }
}