package abstractfactory;

import abstractfactory.animals.Animal;
import abstractfactory.colors.Color;
import abstractfactory.colors.Green;
import abstractfactory.colors.Red;

import static abstractfactory.colors.ColorTypes.GREEN;
import static abstractfactory.colors.ColorTypes.RED;

public class ColorFactory implements AbstractFactory {
    @Override
    public Animal getAnimal(Enum animalType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Color getColor(Enum colorType) {
        if(RED == colorType) {
            return new Red();
        } else if(GREEN == colorType) {
            return new Green();
        }
        return null;
    }
}
