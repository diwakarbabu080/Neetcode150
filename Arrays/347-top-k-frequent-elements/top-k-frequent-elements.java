class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        /*
            Appraoch 1 :
           1.  store the frequencies in hashmap 
            2. for every num in nums array get its frequency if it is greater than k add in ans 
        */

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int val = nums[i];
        //    int count =  map.get(val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> map.get(a)-map.get(b)
        );

        for(int n : map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int arr[] = new int[k];
        for(int i = 0; i<k; i++){
            arr[i] = heap.poll();
        }
        return arr;


        
    }
}