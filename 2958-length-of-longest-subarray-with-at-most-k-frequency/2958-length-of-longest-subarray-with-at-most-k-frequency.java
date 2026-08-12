class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while(end < nums.length) {
            int ele = nums[end];
            while(map.getOrDefault(ele,0) >= k){
                map.put(nums[start],map.get(nums[start])-1);
                start++;
                maxLength = Math.max(maxLength,end-start+1);
            }
            map.put(ele,map.getOrDefault(ele,0)+1);
            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}