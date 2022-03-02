package refactor1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Experiment {
    String experimentName;
    String experimentDescription;
    String researcherName;
    String researcherId;
    String animalSpeciesEng;
    String animalSpeciesLatin;
    List<Integer> animalIds = new ArrayList<>();
    String measurementType;
    List<LocalDateTime> measurementTimes = new ArrayList<>();
    List<Double> measurementsValues = new ArrayList<>();

    public String getExperimentName() {
        return experimentName;
    }

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    public String getExperimentDescription() {
        return experimentDescription;
    }

    public void setExperimentDescription(String experimentDescription) {
        this.experimentDescription = experimentDescription;
    }

    public String getResearcherName() {
        return researcherName;
    }

    public void setResearcherName(String researcherName) {
        this.researcherName = researcherName;
    }

    public String getResearcherId() {
        return researcherId;
    }

    public void setResearcherId(String researcherId) {
        this.researcherId = researcherId;
    }

    public String getAnimalSpeciesEng() {
        return animalSpeciesEng;
    }

    public void setAnimalSpeciesEng(String animalSpeciesEng) {
        this.animalSpeciesEng = animalSpeciesEng;
    }

    public String getAnimalSpeciesLatin() {
        return animalSpeciesLatin;
    }

    public void setAnimalSpeciesLatin(String animalSpeciesLatin) {
        this.animalSpeciesLatin = animalSpeciesLatin;
    }

    public List<Integer> getAnimalIds() {
        return animalIds;
    }

    public void setAnimalIds(List<Integer> animalIds) {
        this.animalIds = animalIds;
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

    @Override
    public String toString() {
        return "Experiment{" +
                "experimentName='" + experimentName + '\'' +
                ", experimentDescription='" + experimentDescription + '\'' +
                ", researcherName='" + researcherName + '\'' +
                ", researcherId='" + researcherId + '\'' +
                ", animalSpeciesEng='" + animalSpeciesEng + '\'' +
                ", animalSpeciesLatin='" + animalSpeciesLatin + '\'' +
                ", animalsIds=" + animalIds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experiment that = (Experiment) o;
        return Objects.equals(experimentName, that.experimentName) && Objects.equals(experimentDescription, that.experimentDescription) && Objects.equals(researcherName, that.researcherName) && Objects.equals(researcherId, that.researcherId) && Objects.equals(animalSpeciesEng, that.animalSpeciesEng) && Objects.equals(animalSpeciesLatin, that.animalSpeciesLatin) && Objects.equals(animalIds, that.animalIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experimentName, experimentDescription, researcherName, researcherId, animalSpeciesEng, animalSpeciesLatin, animalIds);
    }
}
