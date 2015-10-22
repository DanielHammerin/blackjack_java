package BlackJack.model.rules;

public class RulesFactory {

  public IHitStrategy GetHitRule(boolean american) {
    if (american) {
      return new BasicHitStrategy();
    }
    else {
      return new SoftSeventeen();
    }
  }

  public INewGameStrategy GetNewGameRule(boolean american) {
    if (american) {
      return new AmericanNewGameStrategy();
    }
    else {
      return new InternationalNewGameStrategy();
    }
  }
}