public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet hash = new HashSet();
        for(int i= 0 ;i<9;i++){
            for(int j=0;j<9;j++){
                char number = board[i][j];
                if(number != '.'){
                     if (!hash.add(number + " in row " + i) ||
                        !hash.add(number + " in column " + j) ||
                        !hash.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
                }
            }
        }
        return true;
        
    }
}