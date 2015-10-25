package BlackJack.model.rules;

import BlackJack.model.Dealer;
import BlackJack.model.Player;

/**
 * Created by Daniel on 2015-10-25.
 */
public interface IPlayerWinsOnEqualHand {
    boolean isDealerWinner(Player a_player, Dealer a_dealer);
}
