class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        int g1 = 0;
        int g2 = 0; 
        for(int v : nums) {
            x ^= v;
        }
        int low = x & -x;
        for(int v : nums) {
            if((v & low) == 0) {
                g1 ^= v;
            } else if((v & low) != 0) {
                g2 ^= v;
            }
        }
        return(new int [] {g1 , g2});
    }
}