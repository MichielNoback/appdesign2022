package nl.bioinf.nomi.experiment_tracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MeasurementSeries {//the type of data being collected (e.g. blood glucose, cholesterol, blood oxygen %, etc.
    //private String measurementType;
    private MeasurementType measurementType;
    private List<LocalDateTime> measurementTimes = new ArrayList<LocalDateTime>();
    private List<Double> measurementsValues = new ArrayList<Double>();

    public MeasurementSeries() {
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
}