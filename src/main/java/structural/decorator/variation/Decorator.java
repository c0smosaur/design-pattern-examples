package structural.decorator.variation;

import structural.decorator.coffee.Coffee;

public abstract class Decorator extends Coffee {
  Coffee coffee;

  public Decorator(Coffee coffee){
    this.coffee = coffee;
  }
  @Override
  public void brewing() {
    coffee.brewing();
  }
}
