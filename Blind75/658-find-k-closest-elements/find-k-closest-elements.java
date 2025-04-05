class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Step 1: Store the absolute difference between arr[i] and x in a map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, Math.abs(arr[i] - x));
        }

        // Step 2: Use a MaxHeap to keep track of k closest elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                int diffA = map.get(a);
                int diffB = map.get(b);

                if (diffA == diffB) {
                    return arr[b] - arr[a]; // prefer smaller value
                }
                return diffB - diffA; // max heap: keep larger difference on top
            }
        );

        // Step 3: Traverse all indices, maintain heap size of k
        for (int i : map.keySet()) {
            maxHeap.offer(i);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove the farthest element
            }
        }

        // Step 4: Extract elements from heap using stored indices
        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(arr[maxHeap.poll()]);
        }

        // Step 5: Sort the result as required by the problem
        Collections.sort(result);
        return result;
    }
}
