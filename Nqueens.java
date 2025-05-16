class Nqueens {
public static void printBoard(char board[][]){
    System.out.println("-------chess board-----------");
    for(int i = 0; i< board.length; i++){
        for( int j= 0; j < board.length; j++){
            System.out.println(board[i][j]);
        }
    }
}
public static boolean isSafe(char board[][],int row,int j){
    //diagonal left up
    for(int i = row-1, col = j-1; i >= 0 && col >= 0; i--, col--){
        if (board[i][col] == 'Q'){
            return false;
        }
    }

    //vertical up
    for(int i = row-1; i >= 0; i--){
        if (board[i][j] == 'Q') return  false;
    }

    //diagonal right up
    for(int i = row-1, col = j+1; i >=0 && col < board.length; i--, col++){
        if (board[i][col] == 'Q'){
            return false;
        }
    }

    return true;
}
public static void  nQueens (char board[][],int row){
    if (row == board.length){
        printBoard(board);
        return;
    }

    for(int j = 0; j< board.length; j++ ){
        if (isSafe(board,row,j)) {
            board[row][j] = 'Q';
            nQueens(board, row + 1); //function call
            board[row][j] = 'X';  //backtrack step
        }
    }

    }
    public static  void  main(String args[]){
        System.out.println("Hello world");
        int n=4;
        char board[][]= new char[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++ ){
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
    }
}