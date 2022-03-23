package nl.bioinf.nomi.experiment_tracker;

import java.time.LocalDateTime;

public record DataPoint(LocalDateTime dateTime, double measurementValue) {

    public boolean isBefore(DataPoint other) {
        LocalDateTime otherDateTime = other.dateTime;

        return (this.dateTime.compareTo(otherDateTime) < 0);
    }
}
