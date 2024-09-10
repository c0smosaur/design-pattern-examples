package behavioral.templateMethod.playerLevel;

public class NormalLevel extends PlayerLevel{
  @Override
  public void run() {
    System.out.println("달리기");
  }

  @Override
  public void jump() {
    System.out.println("점프");
  }

  @Override
  public void turn() {
    System.out.println("턴 x");
  }

  @Override
  public void showLevelMessage() {
    System.out.println("NORMAL LEVEL");
  }
}
