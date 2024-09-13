package behavioral.iterator.aggregate;

import behavioral.iterator.Book;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.factory.Factory;
import behavioral.iterator.factory.IteratorFactory;

public class BookShelf implements Aggregate {

  private Book[] books;
  private int last = 0;
  Factory f = IteratorFactory.getInstance();

  public BookShelf(int maxSize){
    this.books = new Book[maxSize];
  }
  public Book getBookAt(int index){
    return books[index];
  }
  public void appendBooks(Book book){
    this.books[last] = book;
    last++;
  }
  @Override
  public Iterator iterator(int type) {
    return f.create(this, type);
  }

  @Override
  public int getLength() {
    return last;
  }
}
