class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        long[] ans = new long[n];
        for(List<Integer> list : map.values()){
            int m = list.size();
            long[] prefix = new long[m];
            prefix[0] = list.get(0);
            for(int i=1;i<m;i++){
                prefix[i] = prefix[i-1] + list.get(i);
            }

            for(int i=0;i<m;i++){
                int idx = list.get(i);
                long left = (long) idx*i-(i>0 ? prefix[i-1] : 0);
                long right = (prefix[m-1]-prefix[i])-(long) idx* (m-i-1);
                ans[idx] = left + right;
            }
        }
        return ans;
    }
}