import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int randomChar = random.nextInt(10);
        char planet = PLANET_CLASSES[randomChar];
        return planet;
    }

    String randomShipRegistryNumber() {
        int randomShip = random.nextInt(9999 - 1000 + 1) + 1000;
        String ShipRegistry = "NCC-"+randomShip;
        return ShipRegistry;
    }

    double randomStardate() {
        double starDate = 41000.0 + 1000.0 * random.nextDouble();
        return starDate;
    }
}
