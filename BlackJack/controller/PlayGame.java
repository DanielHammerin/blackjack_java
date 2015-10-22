package BlackJack.controller;

import BlackJack.model.IObserver;
import BlackJack.view.IView;
import BlackJack.model.Game;

import java.util.Scanner;

public class PlayGame implements IObserver{

    //delay

  public boolean Play(Game a_game, IView a_view) throws InterruptedException{


    a_view.DisplayWelcomeMessage();
    
    a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

    if (a_game.IsGameOver())
    {
        a_view.DisplayGameOver(a_game.IsDealerWinner());
    }

    int input = a_view.GetInput();
    
    if (input == 'p')
    {
        boolean murca = false;
        american(murca);

        a_game.NewGame();

    }
    else if (input == 'h')
    {
        a_game.whoWon();
        a_game.Hit();
        Thread.sleep(4000);

    }
    else if (input == 's')
    {
        a_game.whoWonStand();
        a_game.Stand();
    }

    return input != 'q';
  }

    public void update()
    {
    }
    public boolean american(boolean murca) {
      Scanner sc = new Scanner(System.in);
      System.out.println("American version = 'a' International version = 'i'");
      String in = sc.nextLine();
      if (in == "a") {
        murca = true;
        return murca;
      }
      else if (in == "i") {
        murca = false;
        return murca;
      }
      else {
        System.out.println("Not a valid input. Please re-enter");
        return american(murca);
      }
    }
}