class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        /* Approach 1 
        1. Traverse in nums1 and make  set1 ;
        2. now for every element in nums2 check if is present in set1 
        3. if present add it in ans set
        */
        
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int i: nums1){
            set1.add(i);
        }
        

         HashSet<Integer> ans = new HashSet<>();
        for(int i:nums2){
            if(set1.contains(i)){
                ans.add(i);
                set1.remove(i);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}