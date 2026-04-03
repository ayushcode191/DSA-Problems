class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> curr = new ArrayList<>();
            if(i==1){
                curr.add(1);
                list.add(curr);
            }
            else{
                List<Integer> prev = list.get(i-2);
                for(int j=0;j<prev.size()+1;j++){
                    if(j==0){
                        curr.add(prev.get(j));
                    }
                    else if(j==prev.size()){
                        curr.add(prev.get(prev.size()-1));
                    }
                    else{
                        curr.add(prev.get(j)+prev.get(j-1));
                    }
                }
                list.add(curr);
            }
        }
        return list;
    }
}