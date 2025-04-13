class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        
        Integer first = null;
        Integer second = null;

        for(int num :  nums){
            if(first != null && num == first){
                count1++;
            }
            else if (second != null && num == second){
                count2++;
            }else if(count1 == 0) {
                first = num;
                count1 = 1;
            }
            else if (count2 == 0){
                second = num;
                count2 = 1;

            }else{
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for(int i : nums){
            if(i == first){
                count1++;
            }
            else if(i == second){
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        if(count1> n/3){
            ans.add(first);
        }
        if(second != null && count2>n/3){
            ans.add(second);
        }
        
        return ans;
    }
}