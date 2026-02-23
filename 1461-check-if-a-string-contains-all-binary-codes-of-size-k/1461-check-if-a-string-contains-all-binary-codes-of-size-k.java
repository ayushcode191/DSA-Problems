class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        if(n<k) return false;
        int size = 1<<k;
        boolean[] seen = new boolean[size];
        int cnt = 0;
        int hash = 0;
        for(int i=0;i<k;i++){
            hash = (hash << 1) | (s.charAt(i)-'0');
        }
        seen[hash] = true;
        cnt++;
        int mask = size-1;
        for(int i=k;i<n;i++){
            hash = ((hash << 1)&mask) | (s.charAt(i)-'0');
            if(!seen[hash]){
                seen[hash] = true;
                cnt++;
                if(cnt==size) return true;
            }
        }
        return cnt == size;
    }
}