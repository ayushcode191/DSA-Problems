class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int ele = nums[0];
        for(int i=0;i<nums.length;i++){
            if(cnt == 0){
                ele = nums[i];
            }
            if(nums[i]==ele) cnt++;
            else cnt--;
        }
        return ele;
    }
}