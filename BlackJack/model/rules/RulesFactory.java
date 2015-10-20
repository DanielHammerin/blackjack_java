package BlackJack.model.rules;

public class RulesFactory {

  public IHitStrategy GetHitRule() {
      return new BasicHitStrategy();
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