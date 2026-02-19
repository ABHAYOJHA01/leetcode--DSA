public class Solution {
    public int countBinarySubstrings(String s) {
        int prevGroupLength = 0;
        int currGroupLength = 1;
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroupLength++;
            } else {
                result += Math.min(prevGroupLength, currGroupLength);
                prevGroupLength = currGroupLength;
                currGroupLength = 1;
            }
        }
        result += Math.min(prevGroupLength, currGroupLength);
        return result;
    }
}
