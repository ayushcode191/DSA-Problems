class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int min = nums1[0];
        List<Integer> listO = new ArrayList<>();
        for(int num : nums1){
            if(num%2!=0) listO.add(num);
        }
        if(min%2==0){
            for(int num : nums1){
                if(num%2!=0){
                    boolean find = false;
                    for(int o : listO){
                        if(o<num){
                            find = true;
                            break;
                        }
                    }
                    if(!find) return false;
                }
            }
        }
        else{
            for(int num : nums1){
                if(num%2==0){
                    boolean find = false;
                    for(int o : listO){
                        if(o<num){
                            find = true;
                            break;
                        }
                    }
                    if(!find) return false;
                }
            }
        }
        return true;
    }
}