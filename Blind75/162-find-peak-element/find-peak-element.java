class Solution {
    public int findPeakElement(int[] arr) {
    //    int s = 0, e = arr.length - 1;

    //     while (s < e) {
    //         int mid = s + (e - s) / 2;

    //         if (arr[mid] > arr[mid + 1]) {
    //             e = mid; // Peak is on the left (or could be mid itself)
    //         } else {
    //             s = mid + 1; // Peak is on the right
    //         }
    //     }
    //     return s;
    int s = 0;
        int e = arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;

            if(arr[mid]<arr[mid+1]){
                s = mid+1;

            }else{
                e = mid;
            }
        }
        return s;
       
    }
}
            // return -1; // Target not found
