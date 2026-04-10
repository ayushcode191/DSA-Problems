class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> 
            a[0]==b[0] ? b[0]-b[1] : a[0]-b[0]
        );

        int currEnd = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<pairs.length;i++){
            if(currEnd == Integer.MIN_VALUE){
                count++;
                currEnd = pairs[i][1];
            }
            else{
                if(pairs[i][1]<=currEnd){
                    currEnd = pairs[i][1];
                }
                else if(pairs[i][0]>currEnd){
                    count++;
                    currEnd = pairs[i][1];
                }
            }
        }
        return count;
    }
}