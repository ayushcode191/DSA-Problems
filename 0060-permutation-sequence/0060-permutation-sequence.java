class Solution {
    List<String> list = new ArrayList<>();
    public String getPermutation(int n, int k) {
        boolean[] used = new boolean[n + 1];
        func(n,new StringBuilder(),used);
        return list.get(k-1);
    }
    private void func(int n, StringBuilder sb, boolean[] used){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        for(int i=1;i<=n;i++){
            if(used[i]) continue;
            used[i] = true;
            sb.append(i);
            func(n,sb,used);
            sb.deleteCharAt(sb.length()-1);
            used[i] = false;
        }
    }
}