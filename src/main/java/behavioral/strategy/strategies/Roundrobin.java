package behavioral.strategy.strategies;

public class Roundrobin implements Scheduler{
  @Override
  public void getNextCall() {
    System.out.println("순서대로 대기열에서 가져옴");
  }

  @Override
  public void sendCallToAgent() {
    System.out.println("다음 순서 상담원에게 순서대로 배분");
  }
}
