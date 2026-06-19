class Solution {
    public int largestAltitude(int[] gain) {
        int gai = 0;
        int maxGain = 0;
        for(int g : gain){
            gai += g;
            maxGain = Math.max(maxGain,gai);
        }
        return maxGain;
    }
}