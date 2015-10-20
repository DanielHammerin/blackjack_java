package BlackJack.model;

public class Game {

  private Dealer m_dealer;
  private Player m_player;

  public Game() {
    m_dealer = new Dealer(new BlackJack.model.rules.RulesFactory());
    m_player = new Player();
  }
    
    
  public boolean IsGameOver() {
    return m_dealer.IsGameOver();
  }
  
  public boolean IsDealerWinner() {
    return m_dealer.IsDealerWinner(m_player);
  }

  public void whoWon(){     //Method for checking who won the game.

   String playerWon = "The player has won";
    String dealerWon = "The dealer has won";

    if(m_player.CalcScore() == 21){
      System.out.println(playerWon);
    }
    if(m_player.CalcScore() > 21)
    {
      System.out.println(dealerWon);
    }
   if(m_dealer.CalcScore() == 21){
     System.out.println(dealerWon);
   }
   if(m_dealer.CalcScore() > 21){
     System.out.println(playerWon);
   }
  }

  public void whoWonStand()
  {
    String playerWon = "The player has won";
    String dealerWon = "The dealer has won";

    if(m_dealer.CalcScore() > m_player.CalcScore() && m_dealer.CalcScore() < 22)
    {
      System.out.println(dealerWon);
    }

   else if(m_player.CalcScore() > m_dealer.CalcScore() && m_player.CalcScore() < 22)
    {
      System.out.println(playerWon);
    }
  }
  public boolean NewGame() {
    return m_dealer.NewGame(m_player);
  }
  
  public boolean Hit() {
    return m_dealer.Hit(m_player);
  }

  public boolean Stand() {
    return m_dealer.Stand(m_player);
  }
  
  public Iterable<Card> GetDealerHand() {
    return m_dealer.GetHand();
  }
  
  public Iterable<Card> GetPlayerHand() {
    return m_player.GetHand();
  }
  
  public int GetDealerScore() {
    return m_dealer.CalcScore();
  }
  
  public int GetPlayerScore() {
    return m_player.CalcScore();
  }
    
  
}