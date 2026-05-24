class Solution {
    public int passwordStrength(String password) {
        boolean[] isLower = new boolean[26];
        boolean[] isUpper = new boolean[26];
        boolean[] isDigit = new boolean[10];
        String special = "!@#$";
        boolean[] isSpecial = new boolean[special.length()];
        int ans = 0;
        for(char ch : password.toCharArray()){
            if(Character.isLowerCase(ch) && !isLower[ch-'a']){
                isLower[ch-'a'] = true;
                ans += 1;
            }
            else if(Character.isUpperCase(ch) && !isUpper[ch-'A']){
                isUpper[ch-'A'] = true;
                ans += 2;
            }
            else if(Character.isDigit(ch) && !isDigit[ch-'0']){
                isDigit[ch-'0'] = true;
                ans += 3;
            }
            else{
                if(special.indexOf(ch)!=-1 && !isSpecial[special.indexOf(ch)]){
                    isSpecial[special.indexOf(ch)] = true;
                    ans += 5;
                }
            }
        }
        return ans;
        
    }
}