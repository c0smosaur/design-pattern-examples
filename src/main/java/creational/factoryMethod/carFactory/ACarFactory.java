package creational.factoryMethod.carFactory;

import creational.factoryMethod.car.Car;
import creational.factoryMethod.car.SantaFe;
import creational.factoryMethod.car.Sonata;

import java.util.HashMap;

public class ACarFactory extends CarFactory{

  HashMap<String, Car> carMap = new HashMap<>();
  @Override
  public Car createCar(String name) {
    Car car = null;

    if (name.equalsIgnoreCase("sonata")){
      car = new Sonata();
    } else if (name.equalsIgnoreCase("santafe")){
      car = new SantaFe();
    }

    return car;
  }

  public Car returnCar(String name){
    Car car = carMap.get(name);
    if (car==null){
      if (name.equalsIgnoreCase("Tomas")){
        car = new Sonata();
      } else if (name.equalsIgnoreCase("James")){
        car = new SantaFe();
      }
      carMap.put(name, car);
    }
    return car;
  }
}
