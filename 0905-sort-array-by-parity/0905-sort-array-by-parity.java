class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        return(nums);
    }
}


// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int n = nums.length;
//         int[] even = new int[n];
//         int[] odd = new int[n];
//         int e = 0;
//         int o = 0;
//         for(int num : nums) {
//             if(num % 2 == 0) {
//                 even[e++] = num;
//             } else {
//                 odd[o++] = num;
//             }
//         }
//         int k = 0;
//         for(int i = 0; i < e; i++) {
//             nums[k++] = even[i];
//         }
//         for(int i = 0; i < o; i++) {
//             nums[k++] = odd[i];
//         }
//         return(nums);
//     }
// }
