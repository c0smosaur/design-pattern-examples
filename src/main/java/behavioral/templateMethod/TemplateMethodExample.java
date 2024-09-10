package behavioral.templateMethod;

import behavioral.templateMethod.player.Player;
import behavioral.templateMethod.playerLevel.NormalLevel;
import behavioral.templateMethod.playerLevel.PlayerLevel;

public class TemplateMethodExample {
  public static void main(String[] args) {
    Player player = new Player();

    player.play(3);

    PlayerLevel level = new NormalLevel();

    player.upgradeLevel(level);
    player.play(3);
  }
}
