class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0; 
        int count1 = 0; 
        int count2 = 0;
        for(int num : nums) {
            if(num == 0) {
                count0++;
            } else if(num == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int i = 0;
        while(count0 > 0) {
            nums[i] = 0;
            i++;
            count0--;
        }
        while(count1 > 0) {
            nums[i] = 1;
            i++;
            count1--;
        }
        while(count2 > 0) {
            nums[i++] = 2;
            count2--;
        }
    }
}


// class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0; 
//         int mid = 0; 
//         int high = nums.length - 1;
//         while(mid <= high) {
//             if(nums[mid] == 0) {
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             } else if(nums[mid] == 1) {
//                 mid++;
//             } else {
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }
// }
