class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int lim = (int) Math.cbrt(n);
        while((long)(lim+1)*(lim+1)*(lim+1)<=n) lim++;
        while((long)(lim)*(lim)*(lim)>n) lim--;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=lim;i++){
            long one = 1L*i*i*i;
            for(int j=i;j<=lim;j++){
                long sum = one + 1L*j*j*j;
                if(sum > n) break;
                map.put((int) sum, map.getOrDefault((int) sum, 0)+1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=2){
                ans.add(entry.getKey());
            }
        }

        Collections.sort(ans);
        return ans;
    }
}