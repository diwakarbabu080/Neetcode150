class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Using Hashmap

        int left = 0;
        // int e = 0;
        int max = 0;
        HashMap<Character, Integer>map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }else{
                left = Math.max(left, map.get(s.charAt(i))+1);
                map.put(s.charAt(i), i);
            }
            // set.add(s.charAt(i));
            

            
            
            max = Math.max(max, i-left+1);
        }
        return max;
        
    }
}