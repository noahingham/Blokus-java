package comp1140.ass2.Players;

import comp1140.ass2.Game.Piece;
import comp1140.ass2.Scenes.Game;

/**
 * Created by nosha on 25/09/15.
 */
public interface Player {

    public boolean makeMove(Piece piece);
    public void handleClick(int x, int y);
    public void think();


}