class Solution {
    public int mirrorFrequency(String s) {
        int[] chars = new int[26];
        int nums[] = new int[10];
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                nums[c-'0']++;
            }
            else{
                chars[c-'a']++;
            }
        }
        int score = 0;
        for(int i=0;i<13;i++){
            score += Math.abs(chars[i]-chars[25-i]);
        }
        for(int i=0;i<5;i++){
            score += Math.abs(nums[i]-nums[9-i]);
        }
        return score;
    }
}