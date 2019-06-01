package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] boardState;

    public Board(Character[][] matrix) {
        boardState = matrix;
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println();
    }

    public Boolean isInFavorOfX() {
        if (getWinner().equals("X")) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (getWinner().equals("O")) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if (getWinner().equals("")) {
            return true;
        }
        return false;
    }


    public String getWinner() {

        //check rows
        for (int i = 0; i < 3; i++) {
            if (boardState[i][0].equals(boardState[i][1]) && boardState[i][0].equals(boardState[i][2]) ){
                return boardState[i][0].toString();
            }
        }

        //check columns
        for (int i = 0; i < 3; i++) {
            if (boardState[0][i].equals(boardState[1][i]) &&  boardState[0][i].equals(boardState[2][i])){
                return boardState[0][i].toString();
            }
        }

        // Check diagonals
        if (boardState[0][0].equals(boardState[1][1]) &&  boardState[0][0].equals(boardState[2][2])){
                return boardState[0][0].toString();
            }

        if (boardState[0][2].equals(boardState[1][1]) &&  boardState[0][2].equals(boardState[2][0])){
             return boardState[0][2].toString();
        }

        return "";

    }



}
