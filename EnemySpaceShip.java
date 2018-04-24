import oop.ex2.GameGUI;

import java.awt.*;

public abstract class EnemySpaceShip extends SpaceShip {
    public abstract void doAction(SpaceWars game);
    public Image getImage() {
        if (isShieldOn()) {
            return GameGUI.ENEMY_SPACESHIP_IMAGE_SHIELD;
        }
        return GameGUI.ENEMY_SPACESHIP_IMAGE;
    }
}
