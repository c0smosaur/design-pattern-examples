package structural.adapter;

/**
 * ADAPTER
 */

//public class PrintBanner extends Banner implements Print { // --> 상속
public class PrintBanner implements Print { // --> 합성

  private Banner banner;

  public PrintBanner(String string){
    this.banner = new Banner(string);
  }
  @Override
  public void printWeak() {
    banner.showWithParen();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
}
