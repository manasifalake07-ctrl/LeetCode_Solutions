class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return(false);
        }
        int [] freArr = new int[26];
        for(int i = 0 ; i < s.length() ; i++) {
            freArr[s.charAt(i) - 'a']++;
            freArr[t.charAt(i) - 'a']--;
        }
        for(int i : freArr) {
            if(i != 0) {
                return(false);
            }
        }
        return(true);
    }
}