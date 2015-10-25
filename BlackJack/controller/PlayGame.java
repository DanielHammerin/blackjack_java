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

    }

  public boolean Play(Game a_game, IView a_view) throws InterruptedException{


      a_view.DisplayWelcomeMessage();

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
        Thread.sleep(4000);

    }
    else if (input == 's')
    {
        a_game.Stand();
    }

    return input != 'q';
  }

    public void update()
    {

        view.DisplayDealerHand(game.GetDealerHand(), game.GetDealerScore());
        view.DisplayPlayerHand(game.GetPlayerHand(), game.GetPlayerScore());

    }

}