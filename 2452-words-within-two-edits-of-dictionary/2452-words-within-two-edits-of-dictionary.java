class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
        for(String q : queries){
            for(String d : dictionary){
                if(isEditable(q,d)){
                    res.add(q);
                    break;
                }
            }
        }
        return res;
    }
    private boolean isEditable(String q, String d){
        int diff = 0;
        for(int i=0;i<q.length();i++){
            if(q.charAt(i)!=d.charAt(i)){
                diff++;
            }
            if(diff>2) return false;
        }
        return true;
    }
}