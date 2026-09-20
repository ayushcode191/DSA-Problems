class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        int idx = 1;
        for(Character c : s.toCharArray()){
            degree += idx*(26-(c-'a'));
            idx++;
        }
        return degree;
    }
}