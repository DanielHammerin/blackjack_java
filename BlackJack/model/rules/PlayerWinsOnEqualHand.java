package BlackJack.model.rules;

import BlackJack.model.Dealer;
import BlackJack.model.Player;

/**
 * Created by Daniel on 2015-10-25.
 */
public class PlayerWinsOnEqualHand implements IPlayerWinsOnEqualHand{

    protected final int maxScore = 21;
    public boolean isDealerWinner(Player a_player, Dealer a_dealer) {
        if (a_player.CalcScore() > maxScore) {
            return true;
        }
        else if (a_dealer.CalcScore() > maxScore) {
            return false;
        }
        return a_dealer.CalcScore() > a_player.CalcScore();
    }
}
