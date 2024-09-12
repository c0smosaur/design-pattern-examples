package structural.adapter;

public class AdapterExample {
  public static void main(String[] args) {
    Print p = new PrintBanner("Youngblood");
    p.printWeak();
    p.printStrong();
  }
}
