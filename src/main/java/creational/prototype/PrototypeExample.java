package creational.prototype;

public class PrototypeExample {
  public static void main(String[] args) throws CloneNotSupportedException {
    Bookshelf bookShelf = new Bookshelf();
    bookShelf.addBook(new Book("Apple", "Apple"));
    bookShelf.addBook(new Book("Banana", "Banana"));
    bookShelf.addBook(new Book("Cherry", "Cherry"));

    Bookshelf another = (Bookshelf) bookShelf.clone();

    bookShelf.getShelf().get(0).setAuthor("Mango");
    bookShelf.getShelf().get(0).setTitle("Jane");

    System.out.println(bookShelf);
    System.out.println(another);
  }
}
