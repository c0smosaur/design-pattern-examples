package behavioral.strategy.strategies;

public class PriorityAllocation implements Scheduler{
  @Override
  public void getNextCall() {
    System.out.println("높은 등급의 고객 상담부터 먼저 가져옴");
  }

  @Override
  public void sendCallToAgent() {
    System.out.println("업무 능력이 높은 상담원에게 우선적으로 할당");
  }
}
