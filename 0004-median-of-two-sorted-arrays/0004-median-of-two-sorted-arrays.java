class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length-1;
        int n = nums2.length-1;
        int k = m + 1 + n;
        int [] nums3 = new int[m + n + 2];
        int g = nums3.length;
        double median;
        while(m >= 0 && n >= 0) {
            if(nums1[m] > nums2[n]) {
                nums3[k] = nums1[m];
                m--;
            } else {
                nums3[k] = nums2[n];
                n--;
            }
            k--;
        }
        while(n >= 0) {
            nums3[k] = nums2[n];
            n--;
            k--;
        }
        while(m >= 0) {
            nums3[k] = nums1[m];
            m--;
            k--;
        }
        if(g % 2 == 0) {
            median = (nums3[(g/2)-1] + nums3[g/2])/2.0;
        } else {
            median = nums3[g/2];
        }
        return(median);
    }
}