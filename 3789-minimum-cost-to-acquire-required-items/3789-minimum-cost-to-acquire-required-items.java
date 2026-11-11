class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost = 0;
        if(costBoth<cost1+cost2){
            cost += (long) Math.min(need1,need2)*costBoth;
            cost +=(long) (need1 - Math.min(need1,need2))*Math.min(costBoth,cost1);
            cost +=(long) (need2 - Math.min(need1,need2))*Math.min(cost2,costBoth);
        }
        else{

            cost += (long) need1*cost1 + (long) need2*cost2;
        }
        return cost;
    }
}