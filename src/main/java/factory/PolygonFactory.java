package factory;

public class PolygonFactory {

    public static Polygon getPolygon(int numberOfSides) {
        switch(numberOfSides) {
            case 3:
                return new Triangle();
            case 4:
                return new Square();
            case 5:
                return new Pentagon();
            default:
                return null;
        }
    }
}
