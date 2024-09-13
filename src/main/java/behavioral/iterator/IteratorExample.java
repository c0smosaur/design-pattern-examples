package behavioral.iterator;

import behavioral.iterator.aggregate.BookShelf;
import behavioral.iterator.iterator.Iterator;

public class IteratorExample {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBooks(new Book("book A"));
    bookShelf.appendBooks(new Book("book B"));
    bookShelf.appendBooks(new Book("book C"));
    bookShelf.appendBooks(new Book("book D"));

    Iterator iterator = bookShelf.iterator(Constant.FORWARD);
    while (iterator.hasNext()){
      Book book = (Book) iterator.next();
      System.out.println(book.getName());
    }
    System.out.println("-".repeat(40));

    iterator = bookShelf.iterator(Constant.REVERSE);
    while (iterator.hasNext()){
      Book book = (Book) iterator.next();
      System.out.println(book.getName());
    }
  }
}
