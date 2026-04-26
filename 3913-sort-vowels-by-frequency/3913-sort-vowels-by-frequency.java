class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        List<Character> vow = new ArrayList<>();
        Map<Character,Integer> freq = new HashMap<>();
        Map<Character,Integer> fIdx = new HashMap<>();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                vow.add(c);
                freq.put(c,freq.getOrDefault(c,0)+1);
                fIdx.putIfAbsent(c,i);
            }
        }
        Collections.sort(vow, (a,b) -> {
            if(!freq.get(a).equals(freq.get(b))){
                return freq.get(b)-freq.get(a);
            }
            return fIdx.get(a)-fIdx.get(b);
        });
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                sb.append(vow.get(idx++));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
            
        
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}