class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int num=left;num<=right;num++){
            if(isSD(num)){
                res.add(num);
            }
        }
        return res;
    }
    private boolean isSD(int num){
        int temp = num;
        while(temp>0){
            int dig = temp%10;
            if(dig == 0) return false;
            if(num%dig != 0) return false;
            temp /= 10;
        }
        return true;
    }
}