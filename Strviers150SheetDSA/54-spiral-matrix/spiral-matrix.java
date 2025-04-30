class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;
        int i = 0, j = 0;

        while (ans.size() < total) {
            // Move right
            while (j < n && matrix[i][j] != 101) {
                ans.add(matrix[i][j]);
                matrix[i][j] = 101; // mark visited
                j++;
            }
            j--; i++;

            // Move down
            while (i < m && matrix[i][j] != 101) {
                ans.add(matrix[i][j]);
                matrix[i][j] = 101;
                i++;
            }
            i--; j--;

            // Move left
            while (j >= 0 && matrix[i][j] != 101) {
                ans.add(matrix[i][j]);
                matrix[i][j] = 101;
                j--;
            }
            j++; i--;

            // Move up
            while (i >= 0 && matrix[i][j] != 101) {
                ans.add(matrix[i][j]);
                matrix[i][j] = 101;
                i--;
            }
            i++; j++;
        }

        return ans;
    }
}
