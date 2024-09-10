package structural.decorator.coffee;

public class KenyaCoffee extends Coffee{
  @Override
  public void brewing() {
    System.out.print("Kenyan coffee ");
  }
}
