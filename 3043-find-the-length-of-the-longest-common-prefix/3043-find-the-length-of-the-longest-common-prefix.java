class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            while(num > 0){
                set.add(num);
                num /= 10;
            }
        }
        int comm = Integer.MIN_VALUE;
        for(int num : arr2){
            while(num > 0){
                if(set.contains(num)){
                    comm = Math.max(comm,num);
                }
                num /= 10;
            }
        }
        int len = 0;
        while(comm > 0){
            len++;
            comm /= 10;
        }
        return len;
    }
}