class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) ->b-a);

        for(int []arr: matrix){
            for(int i :arr){
                maxHeap.offer(i);
                if(maxHeap.size()>k){
                    maxHeap.remove();
                }
            }
        }

        return maxHeap.peek();

    }
}