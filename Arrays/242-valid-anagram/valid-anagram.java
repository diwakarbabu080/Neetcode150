import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        /* approach 1

            1. push all values in map for s and mark their frequency 
            2. for string 2 try to decrease their frequency count while you iterate 
            3. then if we found any val in arr with values != 0 then return false else true
            T.C : O(3N) , S.C : O(1)
         */
        int arr[] = new int[26];

        for(char c : s.toCharArray()){
            int val = c-'a';
            arr[val] +=1;
        }

        for(char c: t.toCharArray()){
            int val = c-'a';
            arr[val] -=1;

        }

        for(int i : arr){
            if(i < 0){
                return false;
            }
            if(i>0){
                return false;
            }
        }
        return true;
    }
}