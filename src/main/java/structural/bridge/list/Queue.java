package structural.bridge.list;


import structural.bridge.impl.AbstractList;

public class Queue<T> extends List<T> {
  public Queue(AbstractList<T> list) {
    super(list);
    System.out.println("Queue를 구현");
  }

  public void enQueue(T obj){
    impl.addElement(obj);
  }

  public T deQueue(){
    return impl.deleteElement(0);
  }
}
