package structural.proxy;

public class PrinterProxy implements Printable{

  private String name;
  private Printer real;
  public PrinterProxy(){}

  public PrinterProxy(String name){
    this.name = name;
  }
  @Override
  public synchronized void setPrinterName(String name) {
    if (real != null){
      real.setPrinterName(name);
    }
    System.out.println("Proxy: setPrinterName()");
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    System.out.println("Proxy: getPrinterName()");
    return name;
  }

  @Override
  public void print(String string) {
    realize();
    real.print(string);
  }

  public synchronized void realize(){
    if (real == null) {
      real = new Printer(name);
    }
  }
}
