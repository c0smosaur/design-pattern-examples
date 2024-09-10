package behavioral.strategy;

import behavioral.strategy.strategies.LeastJob;
import behavioral.strategy.strategies.PriorityAllocation;
import behavioral.strategy.strategies.Roundrobin;
import behavioral.strategy.strategies.Scheduler;

import java.io.IOException;

public class StrategyExample {
  public static void main(String[] args) throws IOException {
    System.out.println("전화 상담 방식 선택:\nR: 한명씩 차례로 할당\nL: 대기가 가장 적은 상담원에게 할당\nP: 우선순위가 높은 고객부터 할당");

    int ch = System.in.read();
    Scheduler scheduler = null;
    if (ch == 'r' || ch == 'R'){
      scheduler = new Roundrobin();
    } else if (ch == 'l' || ch == 'L'){
      scheduler = new LeastJob();
    } else if (ch == 'p' || ch == 'P'){
      scheduler = new PriorityAllocation();
    } else {
      System.out.println("not supported");
      return;
    }

    scheduler.getNextCall();
    scheduler.sendCallToAgent();
  }
}
