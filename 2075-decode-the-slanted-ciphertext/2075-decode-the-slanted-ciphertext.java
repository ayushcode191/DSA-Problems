class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int p = encodedText.length();
        int m = rows;
        int n = p/m;
        char[][] mat = new char[m][n];
        int k = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = encodedText.charAt(k);
                k++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<n;j++){
            int x = 0;
            int y = j;
            while(x<m && y<n){
                sb.append(mat[x][y]);
                x++;
                y++;
            }
        }
        return sb.toString().stripTrailing();
    }
}