class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] dirs = {
            {-1,-1},{-1,0},{-1,1},
            {0,-1},        {0,1},
            {1,-1},{1,0},{1,1}
        };

        // first pass
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                int live = 0;

                for(int[] d : dirs){
                    int r = i + d[0];
                    int c = j + d[1];

                    if(r>=0 && r<m && c>=0 && c<n){
                        if(board[r][c] == 1 || board[r][c] == 3){
                            live++;
                        }
                    }
                }

                if(board[i][j] == 1){
                    if(live < 2 || live > 3){
                        board[i][j] = 3; // live → dead
                    }
                } else {
                    if(live == 3){
                        board[i][j] = 2; // dead → live
                    }
                }
            }
        }

        // second pass
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(board[i][j] == 2) board[i][j] = 1;
                if(board[i][j] == 3) board[i][j] = 0;
            }
        }
    }
}