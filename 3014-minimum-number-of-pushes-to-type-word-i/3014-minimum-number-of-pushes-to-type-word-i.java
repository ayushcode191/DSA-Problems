class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count = 0;
        int mul = 1;
        while(n>0){
            count += Math.min(8,n)*mul;
            mul++;
            n = n-8;
        }
        return count;
    }
}