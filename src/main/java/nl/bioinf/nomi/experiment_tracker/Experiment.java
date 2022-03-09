package nl.bioinf.nomi.experiment_tracker;

import java.util.*;

public class Experiment {
    private String name;
    private String description;
    private Researcher researcher;
    private Map<Integer, Animal> animals = new HashMap<>();

    public Experiment(String name) {
        this.name = name;
    }

    public Researcher getResearcher() {
        return researcher;
    }

    public void setResearcher(Researcher researcher) {
        this.researcher = researcher;
    }

    public void addAnimal(Animal animal) {
        Objects.requireNonNull(animal);
        if (this.animals.containsKey(animal.animalId())) {
            throw new IllegalArgumentException("animal with this ID already exists");
        }
        this.animals.put(animal.animalId(), animal);
    }

    public Map<Integer, Animal> getAnimals() {
        return Collections.unmodifiableMap(animals);
        //alternative
        //return new HashMap<>(animals);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
