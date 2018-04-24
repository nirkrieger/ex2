import java.awt.Image;

import oop.ex2.*;

/**
 * The API spaceships need to implement for the SpaceWars game.
 * It is your decision whether SpaceShip.java will be an interface, an abstract class,
 * a base class for the other spaceships or any other option you will choose.
 *
 * @author oop
 */
public abstract class SpaceShip {
    /**
     * Class constants:
     */
    public static final int TURN_RIGHT = -1;
    public static final int TURN_LEFT = 1;
    // max health level per ship, any ship.
    private static final int MAX_HEALTH_LEVEL = 22;
    // initial max energy level per ship, any ship.
    private static final int INITIAL_MAX_ENERGY = 210;
    // initial current energy level per ship, any ship.
    private static final int INITIAL_CURRENT_ENERGY = 190;
    // the variable by which energy is recharged in each round.
    private static final int ENERGY_INCREMENTION = 1;
    // shield up energy cost.
    private static final int SHIELD_COST = 3;
    // Shooting energy cost.
    private static final int FIRE_SHOT_COST = 19;
    // Teleport energy cost.
    private static final int TELEPORT_COST = 140;
    // Health cost per hit, when shields are down.
    private static final int HIT_HEALTH_COST = 10;
    // time for shooting cool down.
    private static final int COOLDOWN_TIME = 7;

    /**
     * SpaceShipPhysics objects, handles ship's physical state.
     */
    private SpaceShipPhysics spaceShipPhysics;
    private int maximalEnergy;
    private int currentEnergy;
    private int currentHealth;
    private boolean activateCoolDown;
    private boolean isShieldOn;
    private int coolDownCounter;

    /**
     * Does the actions of this ship for this round.
     * This is called once per round by the SpaceWars game driver.
     *
     * @param game the game object to which this ship belongs.
     */
    public abstract void doAction(SpaceWars game);

    /**
     * This method is called every time a collision with this ship occurs
     */
    public void collidedWithAnotherShip() {

    }

    /**
     * This method is called whenever a ship has died. It resets the ship's
     * attributes, and starts it at a new random position.
     */
    public void reset() {
        // reset location
        spaceShipPhysics = new SpaceShipPhysics();
        maximalEnergy = INITIAL_MAX_ENERGY;
        currentEnergy = INITIAL_CURRENT_ENERGY;
        currentHealth = MAX_HEALTH_LEVEL;
        isShieldOn = false;
        activateCoolDown = false;
        coolDownCounter = 0;
    }

    /**
     * Checks if this ship is dead.
     *
     * @return true if the ship is dead. false otherwise.
     */
    public boolean isDead() {
        return currentHealth <= 0;
    }

    /**
     * Gets the physics object that controls this ship.
     *
     * @return the physics object that controls the ship.
     */
    public SpaceShipPhysics getPhysics() {
        return spaceShipPhysics;
    }

    /**
     * This method is called by the SpaceWars game object when ever this ship
     * gets hit by a shot.
     */
    public void gotHit() {

    }

    /**
     * Gets the image of this ship. This method should return the image of the
     * ship with or without the shield. This will be displayed on the GUI at
     * the end of the round.
     *
     * @return the image of this ship.
     */
    public abstract Image getImage();

    /**
     * Attempts to fire a shot.
     *
     * @param game the game object.
     */
    public void fire(SpaceWars game) {
        if (!activateCoolDown) {
            game.addShot(spaceShipPhysics);
            activateCoolDown = true;
        }
    }

    /**
     * Attempts to turn on the shield.
     * @TODO: Modify this one to true functionality
     */
    public void shieldOn() {

    }

    /**
     * Attempts to teleport.
     */
    public void teleport() {

    }

    /**
     * Attempts to teleport.
     */
    public boolean isShieldOn() {
        return isShieldOn;
    }



}
