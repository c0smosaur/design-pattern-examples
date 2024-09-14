package structural.proxy;

public class ProxyExample {
  public static void main(String[] args) {
    Printable p = new PrinterProxy("Khalid");
    System.out.println("current name is: " + p.getPrinterName());

    p.setPrinterName("Brian");
    System.out.println("current name is: " + p.getPrinterName());

    p.print("Coaster by Khalid");
    p.print("TEST");
    p.setPrinterName("Tomas");

    System.out.println("current name is: " + p.getPrinterName());
  }
}
