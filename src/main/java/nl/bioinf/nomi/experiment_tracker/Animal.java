package nl.bioinf.nomi.experiment_tracker;

import java.util.Map;

public class Animal {

    private int animalId;
    private String animalSpeciesEng;
    private String animalSpeciesLatin;

    private Map<MeasurementType, MeasurementSeries> measurements;

    public Animal(int animalId, String animalSpeciesEng, String animalSpeciesLatin) {
        this.animalId = animalId;
        this.animalSpeciesEng = animalSpeciesEng;
        this.animalSpeciesLatin = animalSpeciesLatin;
    }



}