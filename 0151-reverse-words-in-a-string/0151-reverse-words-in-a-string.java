class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] words = s.split("\\s++");
        // reverse
        int i = 0;
        int j = words.length-1;
        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        return String.join(" ",words).trim();
    }
}