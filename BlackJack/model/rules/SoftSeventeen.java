package BlackJack.model.rules;

import BlackJack.model.Player;

/**
 * Created by Daniel on 2015-10-21.
 */
public class SoftSeventeen implements IHitStrategy {
    private final int g_hitLimit = 17;

    public boolean DoHit(Player a_dealer) {
        int score = a_dealer.CalcScore();

        if (score > 21) {
            int nAces = a_dealer.aceOnHand();
            for (int i = 0; i < nAces; i++) {
                if (score - (i*10) < g_hitLimit) {
                    return true;
                }
            }
        }
        else if (score < g_hitLimit) {
            return true;
        }
        return false;
    }
}
