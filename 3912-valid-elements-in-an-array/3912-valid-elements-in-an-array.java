class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        boolean[] isLG = new boolean[n];
        boolean[] isRG = new boolean[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                isLG[i] = true;
                max = nums[i];
            }
        }
        max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>max){
                isLG[i] = true;
                max = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(isLG[i]||isRG[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}