class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int small[];
        int large[];
        if(m > n ){
            small=nums2;
            large=nums1;
        }else{
            small=nums1;
            large=nums2;

        }

        int total = m + n;

        int i = 0, j = Math.min(m,n);

        while (i <= j){
            int partx = (i+j)/2;
            int party = ( total + 1)/2 - partx;
            
            int l1 = partx == 0 ? Integer.MIN_VALUE : small[partx-1];
            int r1 = partx == small.length ? Integer.MAX_VALUE : small[partx];

            int l2 = party == 0 ? Integer.MIN_VALUE : large[party -1];
            int r2 = party == large.length ? Integer.MAX_VALUE : large[party];

            if(l1 <= r2 && l2 <= r1){
                //means this is valid partition
                if(total % 2 == 0){
                    return (Math.max(l1,l2) + Math.min(r1,r2)) / 2.0 ; 
                }
                else{
                    return Math.max(l1,l2);
                }
            }
            if(l1> r2) 
                j = partx -1 ;
            else
                i = partx + 1;

        }
        return 0;
    }
}