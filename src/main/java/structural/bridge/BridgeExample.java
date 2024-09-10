package structural.bridge;

import structural.bridge.impl.ArrayImpl;
import structural.bridge.impl.LinkedListImpl;
import structural.bridge.list.Queue;
import structural.bridge.list.Stack;

public class BridgeExample {
  public static void main(String[] args) {

    Stack<String> linkedListStack = new Stack<String>(new LinkedListImpl<String>());
    linkedListStack.push("aaa");
    linkedListStack.push("bbb");
    linkedListStack.push("ccc");

    System.out.println(linkedListStack.toString());
    System.out.println(linkedListStack.pop());
    System.out.println(linkedListStack.pop());
    System.out.println(linkedListStack.pop());

    System.out.println("=====");
    Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());

    arrayQueue.enQueue("aaa");
    arrayQueue.enQueue("bbb");
    arrayQueue.enQueue("ccc");

    System.out.println(arrayQueue.toString());
    System.out.println(arrayQueue.deQueue());
    System.out.println(arrayQueue.deQueue());
    System.out.println(arrayQueue.deQueue());
    System.out.println("=========================");

  }
}
