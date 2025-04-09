class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Using Hashmap

        int left = 0;
        // int e = 0;
        int max = 0;
        HashSet<Character>set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){

             if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
            }
            set.add(s.charAt(i));
            }

            
            
            max = Math.max(max, i-left+1);
        }
        return max;
        
    }
}