package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Player;

/**
 * Created by Daniel on 2015-10-21.
 */
public class SoftSeventeen implements IHitStrategy {
    private final int g_hitLimit = 17;
    private boolean isAce = false;

    public boolean DoHit(Player a_dealer) {
        for (Card c : a_dealer.GetHand()) {
            if (c.GetValue() == Card.Value.Ace) {
                isAce = true;
            }
        }
        return a_dealer.CalcScore() == 17 && isAce || a_dealer.CalcScore() < g_hitLimit;
    }
}
