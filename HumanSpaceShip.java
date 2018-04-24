import java.awt.Image;
import oop.ex2.*;

/**
 * HumanSpaceShip represents a human controlled space ship.
 */
public class HumanSpaceShip extends SpaceShip {
    /**
     * HumanSpaceShip constructor
     */
    public HumanSpaceShip() {
        // initialize
        reset();
    }
    public void doAction(SpaceWars game) {
        boolean accelerate = false;
        int turn = 0;
        if (game.getGUI().isUpPressed()) {
            accelerate = true;
        }
        if (game.getGUI().isRightPressed()) {
            turn += SpaceShip.TURN_RIGHT;
        }
        if (game.getGUI().isLeftPressed()) {
            turn += SpaceShip.TURN_LEFT;
        }
        getPhysics().move(accelerate, turn);

        if (game.getGUI().isShotPressed()) {
            fire(game);
        }
    }
    public Image getImage() {
        if (isShieldOn()) {
            return GameGUI.SPACESHIP_IMAGE_SHIELD;
        }
        return GameGUI.SPACESHIP_IMAGE;
    }
}
