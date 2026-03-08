class Solution {
    // Time Complexity : O(n)
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<n;i++){
            char ch = nums[i].charAt(i) == '0' ? '1':'0';
            result.append(ch);
        }
        return result.toString();
    }
    
}