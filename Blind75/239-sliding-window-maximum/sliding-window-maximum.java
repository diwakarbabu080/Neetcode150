class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int ans[] = new int[n-k+1];
		int left = 0;
		int right = 0;
		

		PriorityQueue<Integer>q = new PriorityQueue<>((a,b)-> {
            
            int diff = arr[b]-arr[a];
            if(arr[b] == arr[a]){
                return a-b;
            }
            return arr[b]-arr[a];
            
            });



		while(right<k){
			// if(arr[right]>0){
				q.offer(right);

			// }
			right++;
		}

		ans[0] = arr[q.peek()];
		int counter = 1;
		// counter++;

		while(right<n){
			while (!q.isEmpty() && q.peek() < left + 1) {
                q.poll();
            }
			left++;

			// if(arr[right]>0){
				q.offer(right);

			// }
			right++;


			ans[counter++] = arr[q.peek()];


		}
		return ans;
    }
}