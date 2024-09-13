package behavioral.iterator.iterator;

import behavioral.iterator.Book;
import behavioral.iterator.aggregate.Aggregate;
import behavioral.iterator.aggregate.BookShelf;

public class BookShelfIterator implements Iterator{

  private BookShelf bookShelf;
  private int index;

  public BookShelfIterator(Aggregate bookShelf){
    this.bookShelf = (BookShelf) bookShelf;
    this.index = 0;
  }
  @Override
  public boolean hasNext() {
    return index < bookShelf.getLength();
  }

  @Override
  public Object next() {
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
