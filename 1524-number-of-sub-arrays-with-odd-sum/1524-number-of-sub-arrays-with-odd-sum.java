class Solution {
    
    public int numOfSubarrays(int[] arr) {
        int oddPrefixCount = 0, evenPrefixCount = 1;
        int currSum = 0;
        int count = 0;
        int MOD = 1_000_000_007;

        for (int num : arr){
            currSum += num;

            if (currSum % 2 == 0){
                count = (count + oddPrefixCount) % MOD;
                evenPrefixCount++;
            } 
            else{
                count = (count + evenPrefixCount) % MOD;
                oddPrefixCount++;
            }
        }
        
        return count;
    }
}