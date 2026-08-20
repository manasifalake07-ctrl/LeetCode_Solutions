class Solution {
    int index = 0;
    public String decodeString(String s) {
        return(decode(s));
    }
    public String decode(String s) {
        StringBuilder result = new StringBuilder();
        while(index < s.length() && s.charAt(index) != ']') {
            if(Character.isLetter(s.charAt(index))) {
                result.append(s.charAt(index));
                index++;
            } else {
                int num = 0;
                while(index < s.length() && Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                index++;
                String inside = decode(s);
                index++;
                for(int i = 0; i < num; i++) {
                    result.append(inside);
                }
            }
        }
        return(result.toString());
    }
}