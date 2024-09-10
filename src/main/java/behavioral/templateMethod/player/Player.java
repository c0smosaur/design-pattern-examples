package behavioral.templateMethod.player;

import behavioral.templateMethod.playerLevel.BeginnerLevel;
import behavioral.templateMethod.playerLevel.PlayerLevel;
import lombok.Getter;

@Getter
public class Player {

  private PlayerLevel level;

  public Player(){
    level = new BeginnerLevel();
    level.showLevelMessage();
  }

  public void upgradeLevel(PlayerLevel level){
    System.out.println("LEVEL UP");
    level.showLevelMessage();
    this.level = level;
  }

  public void play(int count){
    level.go(count);
  }
}
