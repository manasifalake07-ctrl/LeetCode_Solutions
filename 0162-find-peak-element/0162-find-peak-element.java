//return any integer index from array which is greater than both of its neighbour In test case 1 3 is greater than 2 and 1 both and 2nd case there are 2 and 6 are greater than neighbour can return index of any index from both
//making case if going from element start to end in array if index not equal to 0 and less than neighbour element skip next part using continue same for index except last element and elemnt to right is greater than element skip iteration by continue and return index which does not satisfy both condition if arr is on only length 1 it will return only 0 and for length 2 compare 2 condition and return largest index of element

// class Solution {
//     public int findPeakElement(int[] nums) {
//         for(int i = 0 ; i < nums.length ; i++) {
//             if(i > 0 && nums[i] <= nums[i-1]) {
//                 continue;
//             } else if(i < nums.length - 1 && nums[i] <= nums[i+1]) {
//                 continue;
//             }
//             return(i);
//         }
//         return(-1);
//     }
// }

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return(left);
    }
}