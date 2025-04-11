class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       

        // Brute force apporach 
        // add the elements in nums1 and sort 


        // int count = m;
        // for(int i : nums2){
        //     nums1[m++] = i;
        // }
        // Arrays.sort(nums1);
        int first = m-1;
        int second  = n-1;
        int pointer = m+n-1;

        while(first >= 0 && second >= 0){

            if(nums1[first]> nums2[second]){
                nums1[pointer--] = nums1[first--];
            }else{
                nums1[pointer--] = nums2[second--];
            }
        }
        while(second>=0){
            nums1[pointer--] = nums2[second--];
        }
        
    }
}