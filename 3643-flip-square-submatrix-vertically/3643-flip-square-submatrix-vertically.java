class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int p = x+k-1;
        int q = y+k-1;
        int i1 = x;
        int i2 = p;
        int j1 = y;
        int j2 = q;
        while(i1<i2){
            // swap i1 and i2 row
            for(int c=j1;c<=j2;c++){
                int temp = grid[i1][c];
                grid[i1][c] = grid[i2][c];
                grid[i2][c] = temp;
            }
            i1++;
            i2--;
        }
        return grid;
    }
}