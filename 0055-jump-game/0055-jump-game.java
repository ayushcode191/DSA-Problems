class Solution {
    public boolean canJump(int[] nums) {
        int maximum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>maximum) return false;
            maximum = Math.max(maximum,i+nums[i]);
            if(maximum >= n-1) return true;
        }
        return true;
    }
}