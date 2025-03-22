class Solution {
    public boolean containsDuplicate(int[] nums) {


        /* approach 1 
        1. sort 
        2. count unique values 
        3. return count < n;
         T.c : O(NlogN), S.C : O(N)

        */

        /* Arrays.sort(arr);

        // for(int i = 0; i<arr.length-1; i++){
        //     if(arr[i] == arr[i+1]){
        //         return true;
        //     }
        // }
        return false;
        */

        /*
        Approach 2 
        1. iterate over array and store in hashset
        2. return set.size<n;
        T.c : O(N), S.C : O(N)
        */

            HashSet<Integer> set = new HashSet<>();
            for(int i : nums){
                if(!set.contains(i)){
                    set.add(i);
                }else{
                    return true;
                }
            }
            return false;
         /*
        Approach 3 (Brute force)
        1. iterate over array and store in hashset
        2. for every index check from index+1 if any duplicate value is present or not
        T.c : O(N^2), S.C : O(1)
        */

    }
}