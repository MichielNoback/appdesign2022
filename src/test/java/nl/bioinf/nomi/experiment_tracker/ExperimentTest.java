package nl.bioinf.nomi.experiment_tracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExperimentTest {
    private Experiment defaultExperiment;

    @BeforeEach
    void createExperiment() {
        defaultExperiment = new Experiment("Experiment with a mouse");
        defaultExperiment.addAnimal(new Animal(1,
                "Rat",
                "Rattus norvegicus"));
    }

    @Test
    void testEncapsulation() {
        Experiment experiment = new Experiment("Exp1");
        experiment.addAnimal(
                new Animal(1,
                        "Mouse",
                        "Mus musculus"));
        Map<Integer, Animal> animals = experiment.getAnimals();
        System.out.println("animals = " + animals);
        animals.clear();
        animals.put(2, new Animal(2,
                "Dragon",
                "Dragonus dragonus"));
        System.out.println("animals = " + animals);
        animals = experiment.getAnimals();
        System.out.println("animals = " + animals);
        //assertEquals();

    }

    @Test
    void addAnimal_singleAnimal() {
        Experiment experiment = new Experiment("Exp2");
        experiment.addAnimal(
                new Animal(1,
                "Mouse",
                "Mus musculus"));
        Map<Integer, Animal> animals = experiment.getAnimals();
        assertEquals(1, animals.size());
        assertEquals(1, animals.get(1).animalId());
        assertEquals("Mouse", animals.get(1).animalSpeciesEng());
        assertEquals("Mus musculus", animals.get(1).animalSpeciesLatin());
    }

    @Test
    void addAnimal_twoIdenticalAnimals() {

    }

    @Test
    void addAnimal_null() {

    }
}