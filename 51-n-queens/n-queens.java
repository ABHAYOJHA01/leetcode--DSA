class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        nqueen(board,0,result);
        return result;
    }
 
 static void nqueen( char[][] board,int row,List<List<String>> result){

      if(row==board.length){
          result.add(construct(board));
          return;
      }

      for(int col=0;col<board.length;col++){
           if(isSafe(board,row,col)){
            board[row][col]='Q';
            nqueen(board,row+1,result);
            board[row][col]='.';
           }
      }


 }

     static boolean isSafe(char[][] board,int row,int col){
           //----------------------------------------
           for(int i=0;i<row;i++){
               if(board[i][col]=='Q') return false;
           }
           //----------------------------------------------
           for(int i=row-1 , j=col-1;i>=0 && j>=0;i--,j--){
               if(board[i][j]=='Q') return false;
           }
           //------------------------------------------------
           for(int i=row-1 , j=col+1;i>=0 &&j<board.length;i--,j++){
               if(board[i][j]=='Q') return false;
           }

           return true;
      }

      static List<String> construct(char[][] board){

       List<String> ans= new ArrayList<>();
           
           for(int i=0;i<board.length;i++){
             ans.add(new String(board[i]));
           }

           return ans;
      }



 }

