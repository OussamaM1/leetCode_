class Solution {
    public boolean squareIsWhite(String coordinates) {

        return (coordinates.charAt(1) + coordinates.charAt(0)) % 2 == 1;
    }
}