class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return(true);
        }
        int i = 0;
        int e = s.length() - 1;
        while(i <= e) {
            char first = s.charAt(i);
            char last = s.charAt(e);
            if(!Character.isLetterOrDigit(first)) {
                i++;
            } else if(!Character.isLetterOrDigit(last)) {
                e--;
            } else {
                if(Character.toLowerCase(first) != Character.toLowerCase(last)) {
                    return(false);
                }
                i++;
                e--;
            }
        }
        return(true);
    }
}