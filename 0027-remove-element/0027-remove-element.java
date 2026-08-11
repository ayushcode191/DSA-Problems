class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
            if(temp != val) start++;
        }
        return start;
    }
}