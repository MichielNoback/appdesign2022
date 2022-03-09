package nl.bioinf.nomi.experiment_tracker;

import java.util.Map;

public class AnimalData {
    private Animal animal;
    private Map<MeasurementType, MeasurementSeries> measurements;

    public AnimalData(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}