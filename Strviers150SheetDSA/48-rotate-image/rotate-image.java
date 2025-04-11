class Solution {
    public void rotate(int[][] matrix) {

        // Rotate image or rotate matrix by 90 

        /*
        Approach 
        1. Rotate(M*N) = Transpose of Matrix + Rev of every Row in matrix

        */

        // Transpose of Matrix 
        int n = matrix.length;
        for(int i = 0; i< n ; i++){
            for(int j = i; j<n; j++){
                if(i == j)continue;
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        // Reverse every row of Matrix ;
        for(int arr[]: matrix){
            int left = 0;
            int right = arr.length-1;

            while(left<right){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }


        
    }
}