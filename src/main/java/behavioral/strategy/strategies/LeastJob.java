package behavioral.strategy.strategies;

public class LeastJob implements Scheduler{
  @Override
  public void getNextCall() {
    System.out.println("순서대로 대기열에서 가져옴");
  }

  @Override
  public void sendCallToAgent() {
    System.out.println("현재 상담 대기가 가장 적은 상담원에게 할당");
  }
}
