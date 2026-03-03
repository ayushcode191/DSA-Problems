class Solution {
    public char findKthBit(int n, int k) {
        return nthString(n).charAt(k-1);
    }
    private String nthString(int n){
        if(n==1){
            return "0";
        }

        return nthString(n-1)+"1"+reverse(invert(nthString(n-1)));
    }
    private String reverse(String str){
        int i=0;
        int j=str.length()-1;
        char[] s = str.toCharArray();
        while(i<j){
            
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return new String(s);
    }
    private String invert(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == '0'){
                chars[i] = '1';
            } 
            else{
                chars[i] = '0';
            }
        }
        return new String(chars);
    }
}