class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m-k+1][n-k+1];
        for(int i=0;i<m-k+1;i++){
            for(int j=0;j<n-k+1;j++){
                List<Integer> list = new ArrayList<>();
                for(int p=i;p<i+k;p++){
                    for(int q=j;q<j+k;q++){
                        list.add(grid[p][q]);
                    }
                }
                Collections.sort(list);
                int minDiff = Integer.MAX_VALUE;
                for(int t = 1;t<list.size();t++){
                    int diff = list.get(t)-list.get(t-1);
                    if(diff != 0){
                        minDiff = Math.min(minDiff,diff);
                    }
                }
                ans[i][j] = minDiff == Integer.MAX_VALUE ? 0 : minDiff;
            }
        }
        return ans;
    }
}