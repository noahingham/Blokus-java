package comp1140.ass2;

import comp1140.ass2.Game.Board;
import comp1140.ass2.Players.AlphaBeta;
import comp1140.ass2.Players.Player;

/**
 * Created by steveb on 12/08/2015.
 *
 * This class is no longer used in the jar
 */
public class BlokGame {

    /**
     * Parse a string representing a game state and determine whether it is legitimate.  The game may be in progress
     * (ie incomplete).
     * @param game A string representing the state of the game, as described in the assignment description.
     * @return True if the string represents a legitimate game state, according to the encoding defined in the
     * assignment description and the rules of the game.
     */
    public static boolean legitimateGame(String game) {
        String[] moves = Board.splitMoves(game);
        Board board = new Board("");
        for(String move : moves) {
            if(!board.legitimateMove(move)) {
                return false;
            }
            board.placePiece(move);
        }
        return true;
    }

    /**
     * Parse a string representing a game state and return a score for the game.  The game may be in progress
     * (ie incomplete), in which case score should reflect the score at that time (if no further moves were made).
     * @param game A string representing the state of the game, as described in the assignment description.
     * @return An array of four integers reflecting the score for the game.   The scores should be given in the playing
     * order specified in the rules of the game, and the scores should be made according to the rules.
     */
    public static int[] scoreGame(String game) {
        Board board = new Board(game);
        return board.currentScore();
    }

    /**
     * Parse a string representing a game state and return a valid next move.  If no move is possible, return a pass ('.')
     * @param game A string representing the state of the game, as described in the assignment description.
     * @return A four-character string representing the next move.
     */
    public static String makeMove(String game) {
        Player bot = new AlphaBeta();
        return bot.think(game);
    }

    public static void main(String[] args) {
        //System.out.println(makeMove("RAAA RBTA  TGAT SCTT QCFF LAQD UHDR"));
        String string = "RAAA RBTA TGAT SCTT QCFF LAQD UHDR";
        System.out.println(legitimateGame(string));
        Board board = new Board(string+makeMove(string));
        System.out.println(board.gridToString());
    }

}
