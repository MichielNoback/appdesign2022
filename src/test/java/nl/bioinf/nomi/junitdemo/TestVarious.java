package nl.bioinf.nomi.junitdemo;

import org.junit.jupiter.api.Test;

public class TestVarious {
    @Test
    void byteOverflowDemo() {
        byte b = 120;
        for (int i = 0; i < 20; i++) {
            System.out.println("b++ = " + b++);
        }
    }
}
