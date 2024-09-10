package structural.decorator.variation;

import structural.decorator.coffee.Coffee;

public class Latte extends Decorator{
  public Latte(Coffee coffee) {
    super(coffee);
  }

  @Override
  public void brewing(){
    super.brewing();
    System.out.print("adding milk ");
  }

}
