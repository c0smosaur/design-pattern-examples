package creational.factoryMethod;

import creational.factoryMethod.car.Car;
import creational.factoryMethod.carFactory.ACarFactory;
import creational.factoryMethod.carFactory.CarFactory;

public class FactoryMethodExample {
  public static void main(String[] args) {
    CarFactory factory = new ACarFactory();

    Car newCar = factory.createCar("sonata");

    System.out.println(newCar);

    Car myCar = factory.returnCar("James");
    Car hisCar = factory.returnCar("James");

    System.out.println(myCar == hisCar);
  }
}
