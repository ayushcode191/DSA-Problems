class Solution {
    public int lengthOfLastWord(String s) {
        String p[]=  s.split(" ");
        return p[p.length-1].length();
    }
}