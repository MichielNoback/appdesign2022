package nl.bioinf.nomi.experiment_tracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MeasurementSeries {
    private MeasurementType measurementType;
    private List<DataPoint> dataPoints = new ArrayList<>();

    public MeasurementSeries() {
    }

    public List<LocalDateTime> getMeasurementTimes() {
        return dataPoints.
                stream().
                map(d -> d.dateTime()).
                collect(Collectors.toList());
    }

    public List<Double> getMeasurementsValues() {
        return dataPoints.
                stream().
                map(d -> d.measurementValue()).
                collect(Collectors.toList());
    }

    /**
     * serves measurement values between two time points
     *
     * @param start
     * @param end
     * @return measurements
     */
    public List<Double> getMeasurementValues(LocalDateTime start, LocalDateTime end) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * serves measurement statistics (mean, median, sd etc) for this experiment
     *
     * @return measurementsStatistics
     */
    public Map<String, Double> getMeasurementsStatistics() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /**
     * serves measurement statistics (mean, median, sd etc) for this experiment for values between two time points
     *
     * @param start
     * @param end
     * @return measurementsStatistics
     */
    public Map<String, Double> getMeasurementsStatistics(LocalDateTime start, LocalDateTime end) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public void addDatapoint(DataPoint datapoint) {
//        if (this.dataPoints.size() == 0) {
//            this.dataPoints.add(datapoint);
//            return;
//        }
        if (this.dataPoints.size() > 0 && this.dataPoints.get(dataPoints.size() - 1).isBefore(datapoint)){
            throw new IllegalArgumentException("the given datapoint lies before the last added");
        }
        this.dataPoints.add(datapoint);
    }
}