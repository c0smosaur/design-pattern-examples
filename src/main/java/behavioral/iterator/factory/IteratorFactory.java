package behavioral.iterator.factory;

import behavioral.iterator.aggregate.Aggregate;
import behavioral.iterator.Constant;
import behavioral.iterator.iterator.BookShelfIterator;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.iterator.ReverseIterator;

public class IteratorFactory extends Factory{

  private static IteratorFactory iFactory = new IteratorFactory();
  private IteratorFactory(){}

  public static IteratorFactory getInstance(){

    if (iFactory == null){
      iFactory = new IteratorFactory();
    }
    return iFactory;
  }
  @Override
  protected Iterator createProduct(Aggregate bookShelf, int type) {
    if (type == Constant.FORWARD){
      return new BookShelfIterator(bookShelf);
    } else if (type == Constant.REVERSE){
      return new ReverseIterator(bookShelf);
    } else {
      return null;
    }
  }
}
