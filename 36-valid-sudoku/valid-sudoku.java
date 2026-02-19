class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i =0; i<9; i++){
            for(int j = 0; j<9; j++){
                char number = board[i][j];
                if(number !='.'){
                    int boxIndex = (i/3) *3 + (j/3);
                    if(!seen.add(number + "in row" + i) ||
                    !seen.add(number + "in col" + j) ||
                    !seen.add(number + "in box" + boxIndex)
                    )return false;
                }
            }
        }
        return true;
    }
}