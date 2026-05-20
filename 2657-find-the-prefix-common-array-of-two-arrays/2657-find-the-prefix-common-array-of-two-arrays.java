class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int count = 0;
        for(int i=0;i<n;i++){
            setA.add(A[i]);
            setB.add(B[i]);
            if(setA.contains(B[i])) count++;
            if(A[i]!=B[i] && setB.contains(A[i])) count++;
            C[i] = count;
        }
        return C;
    }
}