package nl.bioinf.nomi.experiment_tracker;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AnimalData {
    private Animal animal;
    private Map<MeasurementType, MeasurementSeries> measurements = new HashMap<>();

    public AnimalData(Animal animal) {
        this.animal = animal;
//        for (MeasurementType type : MeasurementType.values()) {
//            this.measurements.put(type, new MeasurementSeries());
//        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void addMeasurementSeries(MeasurementType type, MeasurementSeries measurementSeries) {
        this.measurements.put(type, measurementSeries);
    }


    /**
     * Adds a datapoint to this animaldata collection.
     * No null values are allowed for type and dateTime.
     * @param type
     * @param dateTime
     * @param measurementValue
     */
    public void addDatapoint(MeasurementType type,
                             LocalDateTime dateTime,
                             double measurementValue) {
        DataPoint dataPoint = new DataPoint(dateTime, measurementValue);
        addDatapoint(type, dataPoint);
    }

    public void addDatapoint(MeasurementType type,
                             DataPoint dataPoint) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(dataPoint);
        Objects.requireNonNull(dataPoint.dateTime());

        if (!measurements.containsKey(type)) {
            measurements.put(type, new MeasurementSeries());
        }
        measurements.get(type).addDatapoint(dataPoint);
    }

}