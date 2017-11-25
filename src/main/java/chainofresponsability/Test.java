package chainofresponsability;

public class Test {

    public static void main(String[] args) {
        PlanetHandler chain = setupChain();
        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.JUPITER);
    }

    public static PlanetHandler setupChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);
        return mercuryHandler;
    }
}
