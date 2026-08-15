class Solution {
    // 1. Brute force
    // public int trap(int[] height) {
    //     int n = height.length;
    //     int totWater = 0;

    //     for(int i=0;i<n;i++){
    //         int maxL = 0;
    //         int maxR = 0;
    //         for(int j=i;j<n;j++){
    //             maxR = Math.max(maxR,height[j]);
    //         }
    //         for(int j=i;j>=0;j--){
    //             maxL = Math.max(maxL,height[j]);
    //         }
    //         totWater += Math.min(maxL,maxR)-height[i];
    //     }
    //     return totWater;
    // }

    // 2. DP Approach
    public int trap(int[] height) {
        int n = height.length;
        int totWater = 0;

        int[] maxL = new int[n];
        int[] maxR = new int[n];

        maxL[0] = height[0];
        for(int i=1;i<n;i++){
            maxL[i] = Math.max(maxL[i-1],height[i]);
        }

        maxR[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            maxR[i] = Math.max(maxR[i+1],height[i]);
        }

        for(int i=0;i<n;i++){
            totWater += Math.min(maxL[i],maxR[i])-height[i];
        }
        return totWater;
    }

}