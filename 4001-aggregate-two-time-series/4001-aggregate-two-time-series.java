class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int idx1 = 0;
        int idx2 = 0;
        int n1 = series1.length;
        int n2 = series2.length;
        List<List<Integer>> res = new ArrayList<>();
        while(idx1<n1 && idx2<n2){
            if(series1[idx1][0]==series2[idx2][0]){
                List<Integer> list = new ArrayList<>();
                list.add(series1[idx1][0]);
                list.add(series1[idx1][1]+series2[idx2][1]);
                res.add(list);
                idx1++;
                idx2++;
            }
            else if(series1[idx1][0]<series2[idx2][0]){
                List<Integer> list = new ArrayList<>();
                list.add(series1[idx1][0]);
                list.add(series1[idx1][1]+series2[idx2][1]);
                res.add(list);
                idx1++;
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(series2[idx2][0]);
                list.add(series1[idx1][1]+series2[idx2][1]);
                res.add(list);
                idx2++;
            }
        }
        while(idx1<n1){
            List<Integer> list = new ArrayList<>();
            list.add(series1[idx1][0]);
            list.add(series1[idx1][1]);
            res.add(list);
            idx1++;
        }
        while(idx2<n2){
            List<Integer> list = new ArrayList<>();
            list.add(series2[idx2][0]);
            list.add(series2[idx2][1]);
            res.add(list);
            idx2++;
        }
        return res;
    }
}