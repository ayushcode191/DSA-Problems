class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] letters = new int[26];
        for(Character c : s.toCharArray()) {
            letters[c-'a']++;
        }
        char c = 'a';
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<26;i++){
            if(letters[i]%2!=0){
                c = (char) (i + 'a');
            }
            int cnt = letters[i]/2;
            for(int j=0;j<cnt;j++){
                sb.append((char) (i + 'a'));
                sb2.insert(0, (char) (i + 'a'));
            }
            
        }
        if(n%2!=0) sb.append(c);
        sb.append(sb2);
        return sb.toString();
    }
}