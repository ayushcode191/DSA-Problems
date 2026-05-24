class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int k = nums[0];
        boolean isS = true;
        for(int i=0;i<n;i++){
            if(nums[i] != (k+i)%n){
                isS = false;
                break;
            }
        }
        if(isS){
            if(k==0) return 0;
            return Math.min(n-k,k+2);
        }

        int pos = -1;
        for(int i=0;i<n;i++){
            if(nums[i]==n-1){
                pos = i;
                break;
            }
        }

        boolean isRS = true;
        for(int i=0;i<n;i++){
            if(nums[i] != n-1-((i-pos+n)%n)){
                isRS = false;
                break;
            }
        }
        if(isRS){
            return Math.min(pos+1,n-pos+1);
        }
        return -1;
    }
}