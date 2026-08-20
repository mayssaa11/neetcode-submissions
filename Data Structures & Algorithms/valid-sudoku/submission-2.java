class Solution {
    public boolean isValidSudoku(char[][] board) {

        // check one rule at each pass
        // constant complexity O(9²+9²+9²+9²)

        // valid digits
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (board[i][j]=='.') continue;

                // get numeric value, more efficient than Character.getNumericValue(..)
                int c = board[i][j] - '0'; 
                if ( c<1 || c>9 ) return false;
            }
        }

        Set<Integer> set = new HashSet<>();

        // each row i
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (board[i][j]=='.') continue;              
                
                int c = board[i][j] - '0';
                if (set.contains(c)) return false;
                set.add(c);
            }
            set.clear();
        }

        // each column j
        for (int j=0; j<9; j++){
            for (int i=0; i<9; i++){
                if (board[i][j]=='.') continue;  

                int c = board[i][j] - '0';
                if (set.contains(c)) return false;
                set.add(c);
            }
            set.clear();
        }
        
        // each grid of nine 3*3
        for (int i=0; i<9; i+=3){
            for (int j=0; j<9; j+=3){
                // new grid beginning from line i and column j
                for (int k=0; k<3; k++){
                    for (int l=0; l<3; l++){
                        if (board[i+k][j+l]=='.') continue;

                        int c = board[i+k][j+l] - '0';
                        if (set.contains(c)) return false;
                        set.add(c);
    
                    }
                }
                set.clear();
            }
        }

        return true;
    }
}
