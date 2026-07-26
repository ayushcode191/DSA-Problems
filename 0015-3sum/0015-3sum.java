class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int req = -1*nums[i];
            int start = i+1;
            int end = n-1;
            while(start<end){
                int sum = nums[start]+nums[end];
                if(sum == req){
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[start]);
                    curr.add(nums[end]);
                    result.add(curr);
                    start++;
                    end--;
                }
                else if(sum < req){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}