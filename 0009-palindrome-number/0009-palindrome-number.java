class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String s = Integer.toString(x);

        for (int start = 0; start < s.length() / 2; start++) {
            int end = s.length() - 1 - start;

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
        }

        return true;
    }
}