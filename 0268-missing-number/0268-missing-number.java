class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int add = 0;
        // int n = nums.length;
        // for(int i = 0 ; i < nums.length ; i++) {
        //     add += nums[i];
        // }
        // int sum = n*(n+1)/2;
        // int mis = sum - add;
        // return(mis);

        int x = nums.length;
        int i = 0;
        while(i < nums.length) {
            x = x^i;
            x = x^nums[i];
            i++;
        } 
        return(x);
    }
}