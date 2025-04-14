class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else{
                    int left = ans.get(i-1).get(j-1);
                    int right = ans.get(i-1).get(j);
                    temp.add(left+right);
                }
            }
            if(temp.size() != 0){
                ans.add(temp);
            }
            
        }

        return ans;
        
    }
}