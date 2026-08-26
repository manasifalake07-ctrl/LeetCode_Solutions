class Solution {
    public int hammingWeight(int n) {

        // String num = Integer.toBinaryString(n);
        // int count = 0;
        // for(int i = 0 ; i < num.length() ; i++) {
        //     if(num.charAt(i) == '1') {
        //         count++;
        //     }
        // }
        // return(count);

        int i = 0;
        while(n > 0) {
            n = n & (n - 1);
            i++;
        }
        return(i);
        
        // int count = 0;
        // while (n != 0) {
        //     count += n & 1;
        //     n = n >>> 1;
        // }
        // return(count);
    }
}