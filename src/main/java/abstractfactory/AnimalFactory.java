package abstractfactory;

import abstractfactory.animals.Animal;
import abstractfactory.animals.Dog;
import abstractfactory.animals.Duck;
import abstractfactory.colors.Color;

import static abstractfactory.animals.AnimalTypes.DOG;
import static abstractfactory.animals.AnimalTypes.DUCK;

public class AnimalFactory implements AbstractFactory {
    @Override
    public Animal getAnimal(Enum animalType) {
        if(DUCK == animalType) {
            return new Duck();
        } else if(DOG == animalType) {
            return new Dog();
        }
        return null;
    }

    @Override
    public Color getColor(Enum colorType) {
        throw new UnsupportedOperationException();
    }
}
