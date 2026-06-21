class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = Integer.MIN_VALUE;
        for(int c : costs){
            max = Math.max(max,c);
        }
        int[] arr = new int[max];
        for(int c : costs){
            arr[c-1]++;
        }
        int i=0;
        int count = 0;
        while(coins>0 && i<max){
            while(i<max && arr[i]==0) i++;
            if(i >= max) break;
            if(i+1 > coins) break;
            coins -= (i+1);
            arr[i]--;
            count++;
        }
        return count;
    }
}