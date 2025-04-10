class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    
                    if(!map.containsKey(i)){
                        map.put(i, new ArrayList<>());
                    }
                    map.get(i).add(j);
        
        
              
                }
            }   
        
        }   

        for(int i : map.keySet()){
            for(int j : map.get(i)){
                makeColZeros(j, matrix,m,n);
            }
            makeRowZeros(i, matrix,m,n);
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