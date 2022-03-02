package nl.bioinf.nomi.junitdemo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    private Utils utils;

    @BeforeAll
    static void startUpClass() {
        System.out.println("connecting to DB");
    }

    @BeforeEach
    void createUtilsObject() {
        System.out.println("creating new Utils object");
        this.utils = new Utils();
    }

    @Test
    void getDistanceInMeters_ifNegativeSpeed_thenException() {
        try {
            utils.getDistanceInMeters(-1, 60);
            fail();
        } catch(IllegalArgumentException ex) {
            //pass
        }
    }

    @Test
    void getDistanceInMeters_ifNegativeTime_thenException() {
        assertThrows(IllegalArgumentException.class,
                () -> utils.getDistanceInMeters(3600, -1));
    }

    //@Test
    @ParameterizedTest//(name = "{0} speed; {1} time; {2} distance")
    @CsvSource({"20, 5, 100", "100, 1, 100", "50, 3, 150a"})
    void getDistanceInMeters_ifNormalUse_thenNormalReturn(double speed,
                                                          double time,
                                                          double expectedDistance) {
        double actual = utils.getDistanceInMeters(speed, time);
        assertEquals(actual, expectedDistance);
    }

    @Test
    void isLegalDna_validInputs() {
        assertTrue(utils.isLegalDna("GAATTTGCGCA"));
        assertTrue(utils.isLegalDna("gaatttgcgca"));
    }

    @Test
    void isLegalDna_invalidInputs() {
        assertFalse(utils.isLegalDna("GAATTYGCGCA"));
        assertFalse(utils.isLegalDna("gaattt*gcgca"));
    }

    @Test
    void isLegalDna_NullInput() {
        assertThrows(NullPointerException.class, () -> utils.isLegalDna(null));
    }

    @Test
    @DisplayName("With empty input should return false")
    void isLegalDna_emptyInput() {
        assertFalse(utils.isLegalDna(""));
    }

    @Test
    @Disabled
    void collectionsTest() {
        Set one = Set.of("Foo", "Bar");
        Set two = Set.of("Bar", "Foo");

        assertEquals(one, two);
    }

}