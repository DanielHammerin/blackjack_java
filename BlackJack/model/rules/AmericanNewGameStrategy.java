package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.Dealer;
import BlackJack.model.Player;
import BlackJack.model.Card;  

class AmericanNewGameStrategy implements INewGameStrategy {

  public boolean NewGame(Deck a_deck, Dealer a_dealer, Player a_player) {
    Card c;
    //DealAndShowCard(boolean) is for if the card is to dealer or player. false = to player & true = to dealer.
    a_player.DealCard(a_dealer.DealAndShowCard(false));
    a_dealer.DealCard(a_dealer.DealAndShowCard(true));
    a_player.DealCard(a_dealer.DealAndShowCard(false));

    c = a_deck.GetCard();
    c.Show(false);
    a_dealer.DealCard(c);


    return true;
  }
}