package nl.bioinf.nomi.experiment_tracker;

import java.time.LocalDateTime;
import java.util.*;

public class Experiment {
    private String name;
    private String description;
    private Researcher researcher;
    private Map<Integer, Animal> animals = new HashMap<>();

    //the type of data being collected (e.g. blood glucose, cholesterol, blood oxygen %, etc.
    private String measurementType;
    private List<LocalDateTime> measurementTimes = new ArrayList<>();
    private List<Double> measurementsValues = new ArrayList<>();


    public Experiment(String name) {
        this.name = name;
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

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public List<LocalDateTime> getMeasurementTimes() {
        return measurementTimes;
    }

    public void setMeasurementTimes(List<LocalDateTime> measurementTimes) {
        this.measurementTimes = measurementTimes;
    }

    public List<Double> getMeasurementsValues() {
        return measurementsValues;
    }

    public void setMeasurementsValues(List<Double> measurementsValues) {
        this.measurementsValues = measurementsValues;
    }

    /**
     * serves measurement values between two time points
     * @param start
     * @param end
     * @return measurements
     */
    public List<Double> getMeasurementValues(LocalDateTime start, LocalDateTime end) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * serves measurement statistics (mean, median, sd etc) for this experiment
     * @return measurementsStatistics
     */
    public Map<String, Double> getMeasurementsStatistics() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * serves measurement statistics (mean, median, sd etc) for this experiment for values between two time points
     * @param start
     * @param end
     * @return measurementsStatistics
     */
    public Map<String, Double> getMeasurementsStatistics(LocalDateTime start, LocalDateTime end) {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
