package comp1140.ass2;

import comp1140.ass2.Game.Board;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created on 21/08/15.
 */
public class LegitimateMoveTest {

    @Test
    public void leigitimateMove() {
        Board board = new Board("");
        assertTrue(board.legitimateMove("AAAA"));
        board.placePiece("AAAA");
        assertFalse(board.legitimateMove("AAAA"));
    }
}
