class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) ->a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
        int count = 0;
        int maxR = 0;
        for(int[] intv : intervals){
            if(intv[1]>maxR){
                count++;
                maxR = intv[1];
            }
        }
        return count;
    }
}