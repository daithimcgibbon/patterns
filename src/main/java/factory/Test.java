package factory;

public class Test {

    public static void main(String[] args) {
        System.out.println(PolygonFactory.getPolygon(3).getType());
        System.out.println(PolygonFactory.getPolygon(4).getType());
        System.out.println(PolygonFactory.getPolygon(5).getType());
    }
}
