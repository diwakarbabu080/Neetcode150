class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        /*

        Approach 1 
        1. using stack find the Near greatest to right 
        2. then store the number and its NGR in hashmap
        3. for every number in nums1  look NGR in hashmap and store respective value in ans array
        4. return ans

        */
        
        // doing the step 2
        int ngr[] = ngr(nums2);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums2.length; i++){
            map.put(nums2[i], ngr[i]);
        }

        // step 3
        int ans[] = new int[nums1.length];
        int count = 0;
        for(int i: nums1){
            ans[count] = map.get(i);
            count++;
        }
        return ans;

       
        
    }
    // step 1 
    public int[] ngr(int [] nums2){

        int n = nums2.length;
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[n];

        for(int i = n-1; i>=0; i--){

                while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                        stack.pop();
                }
                ans[i] = stack.isEmpty()? -1: stack.peek();
                stack.push(nums2[i]);
        }
        return ans;
        
    }
}