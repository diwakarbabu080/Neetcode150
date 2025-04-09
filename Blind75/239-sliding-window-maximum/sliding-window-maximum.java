class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int ans[] = new int[n - k + 1];
        int left = 0;
        int right = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        // fill first window
        while (right < k) {
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[right]) {
                dq.pollLast();
            }
            dq.offerLast(right);
            right++;
        }

        ans[0] = arr[dq.peekFirst()];
        int counter = 1;

        // sliding the window
        while (right < n) {
            // remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() == left) {
                dq.pollFirst();
            }

            // remove smaller elements from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[right]) {
                dq.pollLast();
            }

            dq.offerLast(right);

            left++;
            right++;

            ans[counter++] = arr[dq.peekFirst()];
        }

        return ans;
    }
}
