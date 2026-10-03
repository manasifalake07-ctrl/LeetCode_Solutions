class Solution {
    public String longestCommonPrefix(String[] strs) {
        //N - Number of String
        //L - length of the longest/initial prefix being checked
        //T(N*L^2)S(L)
        if(strs.length == 0) {
            return("");
        }
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length ; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0 , prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return("");
                }
            }
        }
        return(prefix);
    }
}