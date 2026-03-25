class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum += grid[i][j];
            }
        }
        if(sum%2 != 0){
            return false;
        }

        // row wise
        long rowSum = 0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                rowSum += grid[i][j];
            }
            if(rowSum == sum/2){
                return true;
            }
        }

        // column wise
        long colSum = 0;
        for(int j=0;j<m;j++){
            
            for(int i=0;i<n;i++){
                colSum += grid[i][j];
            }
            if(colSum == sum/2){
                return true;
            }
        }

        return false;
    }
}