class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int temp = n;
        while(temp > 0){
            int dig = temp%10;
            map.put(dig,map.getOrDefault(dig,0)+1);
            temp /= 10;
        }
        int score = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int d = entry.getKey();
            score += d*map.get(d);
        }
        return score;
    }
}