package nl.bioinf.nomi.experiment_tracker;

import java.util.*;

public class Experiment {
    private String name;
    private String description;
    private Researcher researcher;
    private Map<Integer, AnimalData> animals = new HashMap<>();

    public Experiment(String name) {
        this.name = name;
    }

    public Researcher getResearcher() {
        return researcher;
    }

    public void setResearcher(Researcher researcher) {
        this.researcher = researcher;
    }

    public void addAnimalData(AnimalData animalData) {
        Objects.requireNonNull(animalData);
        if (this.animals.containsKey(animalData.getAnimal().animalId())) {
            throw new IllegalArgumentException("animal with this ID already exists");
        }
        this.animals.put(animalData.getAnimal().animalId(), animalData);
    }

    public AnimalData getAnimalData(int animalId) {
        if (animals.containsKey(animalId)) return animals.get(animalId);
        else throw new IllegalArgumentException("this animal is not known: " + animalId);
    }

    public Map<Integer, AnimalData> getAllAnimalData() {
        return Collections.unmodifiableMap(animals);
        //alternative
        //return new HashMap<>(animals);
    }

    public List<AnimalData> getAllAnimalDataAsList() {
        List<AnimalData> all = new ArrayList<>();
        all.addAll(this.animals.values());
        //all.sort((a1, a2) -> Integer.compare(a1.getAnimal().animalId(), a2.getAnimal().animalId()));
        // beter is
        all.sort(Comparator.comparingInt(a -> a.getAnimal().animalId()));
        return all;
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
