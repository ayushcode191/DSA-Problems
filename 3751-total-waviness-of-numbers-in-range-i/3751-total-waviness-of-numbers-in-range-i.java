class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int num = num1;num<=num2;num++){
            String s = String.valueOf(num);
            for(int i=1;i<s.length()-1;i++){
                int dig1 = s.charAt(i-1);
                int dig = s.charAt(i);
                int dig2 = s.charAt(i+1);
                if((dig<dig1 && dig<dig2)||(dig>dig1 && dig>dig2)){
                    count++;
                }
            }
        }
        return count;
    }
}