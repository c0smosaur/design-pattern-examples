package creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
class Bookshelf implements Cloneable{

  private ArrayList<Book> shelf;

  public Bookshelf() {
    shelf = new ArrayList<Book>();
  }

  public void addBook(Book book) {
    shelf.add(book);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {

    Bookshelf another = new Bookshelf();
    for(Book book : shelf) {

      another.addBook(new Book(book.getAuthor(), book.getTitle()));
    }

    return another;
  }
}