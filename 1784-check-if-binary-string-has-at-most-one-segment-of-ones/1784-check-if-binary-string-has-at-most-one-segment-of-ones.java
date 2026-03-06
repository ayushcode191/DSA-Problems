class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int first = -1;
        int last = n;
        int i=0;
        while(i<n && s.charAt(i)!='1'){
            i++;
        }
        int j = n-1;
        while(j>=0 && s.charAt(j)!='1'){
            j--;
        }
        int count = 0;
        for(int k=0;k<n;k++){
            if(s.charAt(k)=='1'){
                count++;
            }
        }
        if(count==0 || j-i+1==count){
            return true;
        }
        return false;

    }
}