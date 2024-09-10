package structural.decorator.variation;

import structural.decorator.coffee.Coffee;

public class Mocha extends Decorator{
  public Mocha(Coffee coffee) {
    super(coffee);
  }

  @Override
  public void brewing(){
    super.brewing();
    System.out.print("adding mocha syrup ");
  }
}
