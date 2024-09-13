package behavioral.iterator.aggregate;

import behavioral.iterator.iterator.Iterator;

public interface Aggregate {
  Iterator iterator(int type);
  int getLength();
}
