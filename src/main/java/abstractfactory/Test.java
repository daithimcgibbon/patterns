package abstractfactory;

import static abstractfactory.FactoryTypes.ANIMAL;
import static abstractfactory.FactoryTypes.COLOR;
import static abstractfactory.animals.AnimalTypes.DOG;
import static abstractfactory.colors.ColorTypes.RED;

public class Test {

    public static void main(String[] args) {

        AbstractFactory animalFactory = FactoryProvider.getFactory(ANIMAL);
        System.out.println(animalFactory.getAnimal(DOG).makeSound());

        AbstractFactory colorFactory = FactoryProvider.getFactory(COLOR);
        System.out.println(colorFactory.getColor(RED).getColor());
    }
}
