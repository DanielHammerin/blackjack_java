package BlackJack.view;

public interface IView {
  void DisplayWelcomeMessage();
  InputChoice GetInput();
  void DisplayCard(BlackJack.model.Card a_card);
  void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayGameOver(boolean a_dealerIsWinner);
  void pauseProgram();
  void DisplayClearConsole();
  enum InputChoice {
    P, H, S, Q
  }
}