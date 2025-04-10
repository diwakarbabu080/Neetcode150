class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

         boolean rowZero = matrix[0][0] == 0? true: false;
         boolean colZero = matrix[0][0] == 0? true: false;

        // HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    
                    if(j == 0){
                        colZero = true;
                    }
                    if(i == 0){
                        rowZero = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;

                }
                // break;
            }   
        
        }   
        
       
        for(int col = 1; col<n; col++){
            if(matrix[0][col] == 0){
                // colZero = true;
                makeColZeros(col, matrix, m, n);
            }
        }
        for(int row = 1; row<m; row++){
            if(matrix[row][0] == 0){
                // rowZero = true;
                makeRowZeros(row, matrix, m, n);
            }
        }

        if(rowZero){
            makeRowZeros(0, matrix, m, n);
        }
        if(colZero){
            makeColZeros(0, matrix, m, n);
        }



    }
    public void makeColZeros(int col , int[][] matrix, int m, int n ){
        for(int row = 0;row< m; row++){
            matrix[row][col] = 0;
        }
    }
    public void makeRowZeros(int row , int[][] matrix, int m , int n){
        for(int col = 0;col< n; col++){
            matrix[row][col] = 0;
        }
    }
}