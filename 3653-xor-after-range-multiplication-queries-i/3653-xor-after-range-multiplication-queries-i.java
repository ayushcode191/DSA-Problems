class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int modulo = 1000000007;
        for(int[] q: queries){
            int idx = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];
            while(idx<=r){
                nums[idx] = (int)(((long)nums[idx]*v)%modulo);
                idx+=k;
            }
        }
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }
}