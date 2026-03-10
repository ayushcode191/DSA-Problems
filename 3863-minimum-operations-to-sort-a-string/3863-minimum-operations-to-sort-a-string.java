class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(n==1) return 0;
        if(n==2 && s.charAt(0)>s.charAt(1)) return -1;
        boolean isAls = true;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                isAls = false;
                break;
            }
        }
        if(isAls) return 0;
        int smallest = 'z';
        int largest = 'a';
        int sIdx = -1;
        int lIdx = -1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(smallest > c){
                smallest = c;
                sIdx = i;
            }
            if(largest<=c){
                largest = c;
                lIdx = i;
            }
        }
        if(sIdx==0 || lIdx==n-1) return 1;
        if(lIdx==0&&sIdx==n-1) return 3;
        return 2;
        
    }
}