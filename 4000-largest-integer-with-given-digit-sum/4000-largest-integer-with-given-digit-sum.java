class Solution {
    public int largestInteger(int n, int s) {
        if(9*n<s) return -1;
        if(s==0) return 0;
        if(n==1) return s;
        int cnt = s/9;
        int rem = s%9;
        int num = 0;
        for(int i=0;i<cnt;i++){
            num = num*10+9;
        }
        int cnt2 = n-cnt;
        if(cnt2>0){
            num = num*10+rem;
        }
        cnt2 -= 1;
        
        for(int i=0;i<cnt2;i++){
            num = num*10;
        }
        return num;
    }
}