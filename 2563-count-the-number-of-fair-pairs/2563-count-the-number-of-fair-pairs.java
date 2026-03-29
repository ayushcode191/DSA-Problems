class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return func(nums,upper) - func(nums,lower-1);
    }
    private long func(int[] nums, int tar){
        int n = nums.length;
        int j=n-1;
        long ans = 0;
        for(int i=0;i<j;i++){
            while(i<j && nums[i]+nums[j]>tar){
                j--;
            }
            ans += j-i;
        }
        return ans;
    }
}