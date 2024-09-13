package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class JavaIteratorExample {
  public void example(){
    ArrayList<String> arrayList = new ArrayList<>();
    Iterator<String> iterator = arrayList.iterator();
    iterator.hasNext();

    LinkedList<String> linkedList = new LinkedList<>();
    Iterator<String> iterator2 = linkedList.iterator();
    iterator2.hasNext();

    Vector<String> vector = new Vector<>();
    Iterator<String> iterator3 = vector.iterator();
    iterator3.hasNext();
  }
}
