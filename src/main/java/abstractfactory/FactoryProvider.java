package abstractfactory;

import static abstractfactory.FactoryTypes.ANIMAL;
import static abstractfactory.FactoryTypes.COLOR;

public class FactoryProvider {
    static AbstractFactory getFactory(Enum factoryType) {
        if(ANIMAL == factoryType) {
            return new AnimalFactory();
        } else if(COLOR == factoryType) {
            return new ColorFactory();
        }
        return null;
    }
}
