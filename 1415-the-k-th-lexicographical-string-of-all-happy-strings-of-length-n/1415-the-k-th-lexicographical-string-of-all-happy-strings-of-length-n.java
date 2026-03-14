class Solution {
    public String getHappyString(int n, int k) {
        int total = (int) (3 * Math.pow(2, n - 1));
        
        if(k>total){
            return "";
        }
        List<String> happyStringsList = new ArrayList<>();
        backtrack(n, new StringBuilder(), happyStringsList);
        if(k<=happyStringsList.size()){
            return happyStringsList.get(k - 1);
        }
        return "";
    }
    private static void backtrack(int n, StringBuilder current, List<String> happyStringsList){
        if (current.length() == n){
            happyStringsList.add(current.toString());
            return;
        }
        for (char ch : new char[]{'a', 'b', 'c'}){
            if (current.length() == 0 || current.charAt(current.length() - 1) != ch){
                current.append(ch);
                backtrack(n, current, happyStringsList);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}