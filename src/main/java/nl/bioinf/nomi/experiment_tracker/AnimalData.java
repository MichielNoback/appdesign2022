package nl.bioinf.nomi.experiment_tracker;

import java.time.LocalDateTime;
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

    public void addMeasurementSeries(MeasurementType type, MeasurementSeries measurementSeries) {
        this.measurements.put(type, measurementSeries);
    }

    public void addDatapoint(LocalDateTime dateTime,
                             MeasurementType type,
                             Double measurementValue) {
        measurements.get(type).addDatapoint(dateTime, measurementValue);
    }


}