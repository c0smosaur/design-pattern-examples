package structural.decorator;

import structural.decorator.coffee.Coffee;
import structural.decorator.coffee.KenyaCoffee;
import structural.decorator.variation.Latte;
import structural.decorator.variation.Mocha;

public class DecoratorExample {
  public static void main(String[] args) {
    Coffee kenyaCoffee = new KenyaCoffee();
    kenyaCoffee.brewing();

    System.out.println();
    Coffee kenyaLatte = new Latte(kenyaCoffee);
    kenyaLatte.brewing();

    System.out.println();
    Coffee mochaKenya = new Mocha(new Latte(new KenyaCoffee()));
    mochaKenya.brewing();
  }
}
