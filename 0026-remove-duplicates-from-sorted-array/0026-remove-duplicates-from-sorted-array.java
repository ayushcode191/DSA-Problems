class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 1;
        int prev = nums[0];
        int j=1;
        while(j<nums.length){
            if(nums[j]==prev) {
                j++;
            }
            else {
                // swap nums[start] & nums[j]
                prev = nums[j];
                int temp = nums[start];
                nums[start] = nums[j];
                nums[j] = temp;
                start++;
                j++;
            }
        }
        return start;
    }
}