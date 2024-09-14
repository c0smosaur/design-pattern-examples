package structural.proxy;

public class Printer implements Printable{
  private String name;
  public Printer(){
    heavyJob("Creating PRINTER instance");
  }
  public Printer(String name) {
    this.name = name;
    heavyJob("Creating PRINTER instance " + name);
  }
  @Override
  public void setPrinterName(String name) {
    System.out.println("real: setPrinterName()");
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    System.out.println("real: getPrinterName()");
    return name;
  }

  @Override
  public void print(String string) {
    System.out.println("==="+ name+ "===");
    System.out.println(string);
  }

  public void heavyJob(String msg) {
    System.out.println(msg);
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e){
        }
      System.out.println(".");
    }
    System.out.println("DONE");
  }
}
