class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        int minL = Integer.MAX_VALUE;
        for(String str : strs){
            minL = Math.min(minL,str.length());
        }
        for(int i=0;i<minL;i++){
            char curr = strs[0].charAt(i);
            for(String str : strs){
                if(curr != str.charAt(i)){
                    return str.substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minL);
    }
}