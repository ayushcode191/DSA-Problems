class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            int rev = getRev(nums[i]);
            if(map.containsKey(rev)){
                ans = Math.min(ans,Math.abs(map.get(rev)-i));
            }
            map.put(nums[i],i);
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }

    private int getRev(int num){
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        return rev;
    }
}