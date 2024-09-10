package behavioral.templateMethod.playerLevel;

public abstract class PlayerLevel {
  public abstract void run();
  public abstract void jump();
  public abstract void turn();
  public abstract void showLevelMessage();

  public final void go(int count) {
    System.out.println("---GO---");
    run();
    for (int i = 0;i<count;i++){
      jump();
    }
    turn();
  }
}
