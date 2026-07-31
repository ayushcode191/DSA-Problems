class Solution {
    public int minimumPushes(String word) {
        int[] letters = new int[26];
        for(Character c : word.toCharArray()){
            letters[c-'a']++;
        }
        Arrays.sort(letters);
        int mul = 1;
        int count = 0;
        int cnt = 0;
        for(int i=25;i>=0;i--){
            if(letters[i]!=0){
                count += letters[i]*mul;
                cnt++;
                if(cnt==8){
                    mul++;
                    cnt = 0;
                }
            }
        }
        return count;
    }
}