class Solution {
    public int firstUniqChar(String s) {
        int [] frArr = new int[26];
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            frArr[s.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < s.length() ; i++) {
            if(frArr[s.charAt(i) - 'a'] == 1) {
                return(i);
            }
        }
        return(-1);
    }
}