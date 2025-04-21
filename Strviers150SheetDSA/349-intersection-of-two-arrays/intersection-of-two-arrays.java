class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        /* Approach 1 
        1. Traverse in nums1 and nums2 and make respc set1 and set2;
        2. Make a set ans while iterating in num1 and num2 check if it is present in set1 and set2 
        3. if present add it in ans set
        */
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }

         HashSet<Integer> ans = new HashSet<>();
        for(int i:nums1){
            if(set1.contains(i) && set2.contains(i)){
                ans.add(i);
            }
        }
        Integer[] res =  ans.toArray(new Integer[0]);
        // int res[] = new/
        int[] res2 = Arrays.stream(res).mapToInt(Integer::intValue).toArray();
        return res2;

    }
}