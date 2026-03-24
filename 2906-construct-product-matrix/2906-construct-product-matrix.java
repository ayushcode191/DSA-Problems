class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr = new int[n*m];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k] = grid[i][j]%12345;
                k++;
            }
        }
        int[] prefix = new int[n*m];
        int[] suffix = new int[n*m];
        prefix[0] = 1;
        for(int i=0;i<n*m-1;i++){
            prefix[i+1] = (int) ((long)(prefix[i]*arr[i]%12345));
        }
        suffix[n*m-1] = 1;
        for(int i=n*m-1;i>0;i--){
            suffix[i-1] = (int) ((long)(suffix[i]*arr[i]%12345));
        }
        int[][] res = new int[n][m];
        k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j] = (int) ((long)(prefix[k]*suffix[k]%12345));
                k++;
            }
        }
        return res;

    }
}