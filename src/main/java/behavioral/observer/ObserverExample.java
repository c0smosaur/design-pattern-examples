package behavioral.observer;

import behavioral.observer.generator.NumberGenerator;
import behavioral.observer.generator.RandomNumberGenerator;
import behavioral.observer.observer.DigitObserver;
import behavioral.observer.observer.GraphObserver;
import behavioral.observer.observer.Observer;

public class ObserverExample {
  public static void main(String[] args) {
    NumberGenerator generator = new RandomNumberGenerator();

    Observer ob1 = new DigitObserver();
    Observer ob2 = new GraphObserver();

    generator.addObserver(ob1);
    generator.addObserver(ob2);

    generator.execute();
  }
}
