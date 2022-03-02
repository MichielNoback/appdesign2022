package nl.bioinf.nomi.junitdemo;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public double getDistanceInMeters(double speedInMetersPerSecond, double elapsedTimeInSeconds) {
        if (speedInMetersPerSecond < 0 || elapsedTimeInSeconds < 0) {
            throw new IllegalArgumentException("time and speed can not be negative! Given speede = " + speedInMetersPerSecond
            + " time=" + elapsedTimeInSeconds);
        }

        return speedInMetersPerSecond * elapsedTimeInSeconds;
//        throw new UnsupportedOperationException();
    }

    public boolean isLegalDna(String sequence) {
        Objects.requireNonNull(sequence);
        if (isIllegalInput(sequence)) return false;

        Pattern p = Pattern.compile("[^ACGT]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(sequence);
        return !m.find();
    }

    private boolean isIllegalInput(String sequence) {
        return sequence.isEmpty() || sequence.isBlank();
    }


}
