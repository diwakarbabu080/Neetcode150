class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        /*
            Appraoch 1 :
           1.  store the frequencies in hashmap 
            2. create a Prirority Queue such that is stores top k elements based on their frequency values
        */

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int val = nums[i];
        //    int count =  map.get(val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        // 
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> map.get(a)-map.get(b)
        );

        for(int n : map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        // Creating a arr for storing the answer
        int arr[] = new int[k];
        for(int i = 0; i<k; i++){
            arr[i] = heap.poll();
        }
        return arr;


        
    }
}
