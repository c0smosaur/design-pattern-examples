package behavioral.strategy.strategies;

public interface Scheduler {

  public void getNextCall();
  public void sendCallToAgent();
}
