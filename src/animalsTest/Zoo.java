package animalsTest;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Cat animal) {
        animals.add(animal);
    }

    public void addAnimal(Dog animal) {
        animals.add(animal);
    }

    public void voiceAll() {
        for (Animal animal : animals) {
            System.out.println(animal.getVoice());
        }
    }
    public static void printDomesticAnimalName(Domestic domesticAnimal){
        System.out.println(domesticAnimal.getName());

    }
}
