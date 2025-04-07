class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        /*
        Approach using hashmap
        1. for every string in strs do the countOfIndexes 
        2. make this into string  
        add if it is not already present in hashmap along with the index i
        3. for every string in keySet() make a list and add it ans list;
        
        */

        if (strs.length == 0)
            return new ArrayList<>();
        // List<List<String>> ans = new ArrayList<>();
        // HashMap<String,List<Integer>> map = new HashMap<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {

            // int count [] = new int[26];

            String s = strs[i];
            int countArr[] = new int[26];
            for (char ch : s.toCharArray()) {
                int val = ch - 'a';
                countArr[val] += 1;
            }

            // making into string
            StringBuilder temp = new StringBuilder();
            for (int count : countArr) {
                temp.append(count+"#");
            }
            String key = temp.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);

        }
        List<List<String>> ans = new ArrayList<>();

        for (List<String> group : map.values()) {
            ans.add(group);
        }

        return ans;

    }
}