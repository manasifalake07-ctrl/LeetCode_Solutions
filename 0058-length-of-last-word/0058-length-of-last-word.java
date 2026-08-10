class Solution {
    public int lengthOfLastWord(String s) {
        String [] parts = s.trim().split("\\s+");
        int indexOfLastWord = parts.length - 1;
        String LastWord = parts[indexOfLastWord];
        int lengthofLastWord = LastWord.length();
        return(lengthofLastWord);
    }
}