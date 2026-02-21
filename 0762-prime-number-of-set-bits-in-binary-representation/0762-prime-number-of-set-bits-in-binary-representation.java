class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i=left;i<=right;i++){
            int count = countSetBits(i);
            if(isPrime(count)){
                ans++;
            }
        }
        return ans;
    }
    private int countSetBits(int n){
        int count = 0;
        while(n>0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    private boolean isPrime(int n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}