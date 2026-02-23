class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<n;j++){
                sb.append(s.charAt(j));
                if(j-i+1==k){
                    set.add(sb.toString());
                }
                if(j-i+1>k){
                    break;
                }
                
            }
        }
        return set.size() == Math.pow(2,k);

    }
}