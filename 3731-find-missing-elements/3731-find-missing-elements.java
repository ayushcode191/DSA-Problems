class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        int n = nums.length;
        for(int i=0;i<n;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}