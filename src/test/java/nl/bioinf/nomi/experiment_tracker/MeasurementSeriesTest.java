package nl.bioinf.nomi.experiment_tracker;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementSeriesTest {

    @Test
    void addDatapoint_nullValue_thenException() {

    }

    @Test
    void addDatapoint_olderDate_thenException() {
        try {
            MeasurementSeries ms = new MeasurementSeries();
            LocalDateTime dt = LocalDateTime.of(2022, 03, 23, 9,51);
            DataPoint d = new DataPoint(dt, 0.4321);
            ms.addDatapoint(d);

            dt = LocalDateTime.of(2022, 03, 23, 8,51);
            d = new DataPoint(dt, 0.4321);
            ms.addDatapoint(d);

            fail();
        } catch (IllegalArgumentException ex) {
            //pass
        }

    }

}