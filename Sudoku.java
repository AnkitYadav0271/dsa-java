class Sudoku{
    //Print sudoku function starts here
    public static void printSudoku(int sudoku[][]){
        for (int row = 0; row <= 8; row++){
            for (int col = 0; col <= 8;col++){
                System.out.println(sudoku[row][col]);
            }
        }
    }
    //isSafe function starts here
    public  static  boolean isSafe(int sudoku[][], int row, int col, int digit){
        //column
        for (int i = 0; i<=8;i++){
            if (sudoku[i][col] == digit){
                return false;
            }
        }
        //for row
        for(int j = 0; j <= 8; j++){
          if (sudoku[row][j] == digit){
              return false;
          }
        }

//        for grid?
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for (int i = sr; i<sr+3;i++){
            for (int j = sc; j< sc + 3;j++){
                if (sudoku[i][j] == digit){
                    return false;
                }
            }
        }
    return  true;
    }

    //sudoku solver function starts here

    public static boolean sudokuSolver(int sudoko[][],int row,int col){
        //base case
        if (row == 9 && col == 0){
            return true;
        }

        int nextRow = row , nexCol = col+1;
        if ( col+1 == 9){
            nextRow = row+1;
            nexCol = 0;
        }
    if (sudoko[row][col] != 0){
       return sudokuSolver(sudoko,nextRow,nexCol);
    }
    for (int digit=1; digit<=9;digit++){
        if (isSafe(sudoko,row,col,digit)){
            sudoko[row][col] = digit;
            if(sudokuSolver(sudoko,nextRow,nexCol)){
                return true;
            }
            sudoko[row][col] = 0;
        }
    }
    return false;
    }

    public static  void  main(String args []){

        System.out.println("Hello Happy is here");
    int sudoko [][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
    };
    if (sudokuSolver(sudoko,0,0)){
        System.out.println("Solution Exist");
        printSudoku(sudoko);
    } else {
        System.out.println("Solution does not exist");
    }
    }


}