package abstractfactory;

import abstractfactory.animals.Animal;
import abstractfactory.colors.Color;

public interface AbstractFactory {
    Animal getAnimal(Enum animalType);
    Color getColor(Enum colorType);
}
