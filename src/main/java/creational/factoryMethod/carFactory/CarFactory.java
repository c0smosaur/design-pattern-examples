package creational.factoryMethod.carFactory;

import creational.factoryMethod.car.Car;

public abstract class CarFactory {

  public abstract Car createCar(String name);

  public void numbering(){
    System.out.println("numbering");
  };
  public void washCar(){
    System.out.println("wash");
  };

  public abstract Car returnCar(String name);

  final public void sellCar(String name){
    numbering();;
    washCar();
    sellCar(name);
  };
}
