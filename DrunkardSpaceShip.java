import java.awt.*;
import oop.ex2.*;

public class DrunkardSpaceShip extends EnemySpaceShip {
    public DrunkardSpaceShip() {
        reset();
    }
    public void doAction(SpaceWars game) {

    }
    public Image getImage() {
        return GameGUI.ENEMY_SPACESHIP_IMAGE;
    }
}
