package nl.bioinf.nomi.experiment_tracker;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AnimalDataTest {

    @Test
    void addMeasurementSeries() {
    }

    @Test
    void addDatapoint() {
        AnimalData animalData = new AnimalData(
                new Animal(1,
                        "Sus scrofa",
                        "Pig"));
        animalData.addDatapoint(MeasurementType.BLOOD_CHOLESTEROL,
                LocalDateTime.now(),
                0);
    }

    @Test
    void testAddDatapoint() {
    }
}