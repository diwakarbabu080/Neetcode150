class Solution {
    public int findKthLargest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) ->a-b);

       
            for(int i :arr){
                minHeap.offer(i);
                if(minHeap.size()>k){
                    minHeap.remove();
                }
            }
      

        return minHeap.peek();
        
    }
}