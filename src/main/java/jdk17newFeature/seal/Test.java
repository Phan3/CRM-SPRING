package jdk17newFeature.seal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal rabbit = new Rabit();

        List<Animal> animals = new ArrayList<>();
        animals.add(pig);
        animals.add(rabbit);


        for(Animal animal: animals) {
            switch (animal) {
                case Pig p -> p.an();
                case Rabit r -> r.jump();
            }
        }

    }
}
