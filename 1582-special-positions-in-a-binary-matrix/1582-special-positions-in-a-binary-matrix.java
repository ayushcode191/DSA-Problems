class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];

        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += mat[i][j];
            }
            rowSum[i] = sum;
        }
        for(int j=0;j<n;j++){
            int sum = 0;
            for(int i=0;i<m;i++){
                sum += mat[i][j];
            }
            colSum[j] = sum;
        }
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && rowSum[i]==1 && colSum[j]==1){
                    count++;
                }
            }
        }
        return count;

    }
}