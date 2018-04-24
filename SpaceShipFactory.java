import oop.ex2.*;

/**
 * SpaceShipFactory class provides a single static method for generating SpaceShips out of command-line
 * arguments.
 * @TODO: Think about a better way to implement this one.
 * @TODO: Human can appear only once.
 * @author nirkr
 */
public class SpaceShipFactory {

    private static final String HUMAN = "h";
    private static final String RUNNER = "r";
    private static final String BASHER = "b";
    private static final String AGGRESSIVE = "a";
    private static final String DRUNKARD = "d";
    private static final String SPECIAL = "s";

    /**
     * This method receives command-line arguments and returns an array of newly generated ships,
     * respectively to the denoted ship-type representing letters.
     * @param args command-line arguments.
     * @return a space
     */
    public static SpaceShip[] createSpaceShips(String[] args) {
        // initialize a SpaceShip array the size of args.
        SpaceShip[] spaceShips = new SpaceShip[args.length];
        // set a ship counter
        int shipsCounter = 0;
        // iterate args
        for (String str : args) {
            SpaceShip spaceShip;
            switch (str) {
                case HUMAN:
                    spaceShip = new HumanSpaceShip();
                    break;
                case RUNNER:
                    spaceShip = new RunnerSpaceShip();
                    break;
                case BASHER:
                    spaceShip = new BasherSpaceShip();
                    break;
                case AGGRESSIVE:
                    spaceShip = new AggressiveSpaceShip();
                    break;
                case DRUNKARD:
                    spaceShip = new DrunkardSpaceShip();
                    break;
                case SPECIAL:
                    spaceShip = new SpecialSpaceShip();
                    break;
                default: // unknown ship type, continue loop.
                    continue;

            }
            // make sure spaceShip is not null, if so place in array and increment counter by 1.
            if (spaceShip != null) {
                spaceShips[shipsCounter] = spaceShip;
                shipsCounter++;
            }
        }
        return spaceShips;
    }
}
