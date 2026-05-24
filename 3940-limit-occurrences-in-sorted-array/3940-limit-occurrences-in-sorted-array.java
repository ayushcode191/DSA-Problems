class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int currCount = 0;
        int prev = -1;
        for(int num : nums){
            if(num == prev) currCount++;
            if(num!= prev){
                currCount =1;
                prev = num;
            }
            if(currCount <= k){
                list.add(num);
            }
        }
        int[] res = new int[list.size()];
        int j=0;
        for(int num : list){
            res[j++] = num;
        }
        return res;
    }
}