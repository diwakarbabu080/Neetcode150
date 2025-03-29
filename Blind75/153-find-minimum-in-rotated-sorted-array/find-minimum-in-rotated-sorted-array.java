class Solution {
    public int findMin(int[] arr) {
    
        int n = arr.length;
       int s = 0;
       int e = n-1;
        // int f = s;
        // int l = e;
       while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]< arr[0]){
                e = mid-1;
            }else{
                s = mid+1;
            }
       }
       return arr[(e+1)%n];
    }
        
    
}