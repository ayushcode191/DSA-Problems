class Solution {
    public int pivotInteger(int n) {
        int totalSum = (n*(n+1))/2;
        int curr = 0;
        for(int i=1;i<=n;i++){
            int last = totalSum - curr;
            curr += i;
            if(curr == last) return i;
        }
        return -1;
    }
}