package nl.bioinf.nomi.experiment_tracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExperimentTest {
    private Experiment defaultExperiment;

    @BeforeEach
    void createExperiment() {
        defaultExperiment = new Experiment("Experiment with a mouse");
        defaultExperiment.addAnimalData(
                new AnimalData(new Animal(1,"Rat", "Rattus norvegicus")));
    }

    @Disabled("Demo purposes")
    @Test
    void testEncapsulation() {
        Experiment experiment = new Experiment("Exp1");
        experiment.addAnimalData(
                new AnimalData(new Animal(1,
                        "Mouse",
                        "Mus musculus")));
        Map<Integer, AnimalData> animals = experiment.getAllAnimalData();
        System.out.println("animals = " + animals);
        animals.clear();
        animals.put(2, new AnimalData(new Animal(2,
                "Dragon",
                "Dragonus dragonus")));
        System.out.println("animals = " + animals);
        animals = experiment.getAllAnimalData();
        System.out.println("animals = " + animals);
        //assertEquals();

    }

    @Test
    void addAnimal_singleAnimal() {
        Experiment experiment = new Experiment("Exp2");
        experiment.addAnimalData(
                new AnimalData(new Animal(1,
                "Mouse",
                "Mus musculus")));
        Map<Integer, AnimalData> animals = experiment.getAllAnimalData();
        assertEquals(1, animals.size());
        assertEquals(1, animals.get(1).getAnimal().animalId());
        assertEquals("Mouse", animals.get(1).getAnimal().animalSpeciesEng());
        assertEquals("Mus musculus", animals.get(1).getAnimal().animalSpeciesLatin());
    }

    @Test
    void addAnimal_twoIdenticalAnimals() {

    }

    @Test
    void addAnimal_null() {

    }
}