class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 1;
        int prev = nums[0];
        int freq = 1;
        int j=1;
        while(j<nums.length){
            if(nums[j]==prev) {
                if(freq<2){
                    int temp = nums[start];
                    nums[start] = nums[j];
                    nums[j] = temp;
                    freq++;
                    j++;
                    start++;
                }
                else{
                    j++;
                }
            }
            else {
                // swap nums[start] & nums[j]
                prev = nums[j];
                int temp = nums[start];
                nums[start] = nums[j];
                nums[j] = temp;
                freq = 1;
                start++;
                j++;
            }
        }
        return start;
    }
}