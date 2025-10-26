class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        for (char c : t.toCharArray()) {
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return c;
            }
        }
        return ' ';
    }
}
