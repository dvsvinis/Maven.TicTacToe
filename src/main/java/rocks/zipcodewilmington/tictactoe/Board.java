package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                matrix[i][j].charValue();
            }
        }
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        String winner = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == matrix[i][j] && matrix[i][j] == matrix[i][j]) {
                    winner = matrix[i][j].charValue();
                }
            }
        }
        return winner;
    }


        // check all rows
//        for(int x=0; x<3; x++) {
//            if( (matrix[x][0] == matrix[x][1]) && (matrix[x][1] == matrix[x][2]) ) {
//                return(matrix[x][1]);
//            }
//    }

}
