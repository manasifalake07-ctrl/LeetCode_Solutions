class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length - 1;
        int n = nums2.length - 1;
        int k = m + n + 1;
        int [] nums = new int [m + n + 2];
        int g = nums.length;
        while(m >= 0 && n >= 0) {
            if(nums1[m] > nums2[n]) {
                nums[k] = nums1[m];
                m--;
            } else {
                nums[k] = nums2[n];
                n--;
            }
            k--;
        }
        while(m >= 0) {
            nums[k] = nums1[m];
            m--;
            k--;
        }
        while(n >= 0) {
            nums[k] = nums2[n];
            n--;
            k--;
        }
        double median;
        if(g % 2 == 0) {
            median = (nums[(g/2) - 1] + nums[g/2])/2.0;
        } else {
            median = nums[g/2];
        }
        return(median);
    }
}