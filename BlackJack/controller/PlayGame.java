package BlackJack.controller;

import BlackJack.model.IObserver;
import BlackJack.view.IView;
import BlackJack.model.Game;

public class PlayGame implements IObserver{

    Game game;
    IView view;
    public PlayGame(Game a_game, IView a_view){
        game = a_game;
        view = a_view;
        a_game.register(this);

    }

  public boolean Play(Game a_game, IView a_view) {


      a_view.DisplayWelcomeMessage();

    view.DisplayDealerHand(game.GetDealerHand(), game.GetDealerScore());
    view.DisplayPlayerHand(game.GetPlayerHand(), game.GetPlayerScore());

    if (a_game.IsGameOver())
    {
        a_view.DisplayGameOver(a_game.IsDealerWinner());

    }

    int input = a_view.GetInput();
    
    if (input == 'p')
    {
        a_game.NewGame();

    }
    else if (input == 'h')
    {
        a_game.Hit();
      view.pauseProgram();
    }
    else if (input == 's')
    {
        a_game.Stand();
      view.pauseProgram();
    }

    return input != 'q';
  }

    public void update()
    {
        view.DisplayDealerHand(game.GetDealerHand(), game.GetDealerScore());
        view.DisplayPlayerHand(game.GetPlayerHand(), game.GetPlayerScore());
    }

}