package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.Dealer;
import BlackJack.model.Player;
import BlackJack.model.Card;  

class InternationalNewGameStrategy implements INewGameStrategy {

  public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
    Card c;
  
    a_player.DealCard(a_dealer.DealAndShowCard(false));
  
    a_dealer.DealCard(a_dealer.DealAndShowCard(true));
  
    a_player.DealCard(a_dealer.DealAndShowCard(false));
  
    return true;
  }
}