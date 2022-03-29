package nl.bioinf.nomi.junitdemo;

import nl.bioinf.nomi.singleton.Database;
import nl.bioinf.nomi.singleton.DatabaseEnum;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.Optional;

public class TestVarious {
    @Test
    void byteOverflowDemo() {
        byte b = 120;
        for (int i = 0; i < 20; i++) {
            System.out.println("b++ = " + b++);
        }
    }


    @Test
    void optionalDemo() {
        Optional<String> stringOptional = getOptionalOfString();
        System.out.println(stringOptional.orElse("Hoi").toUpperCase(Locale.ROOT));

    }

    private Optional<String> getOptionalOfString() {

        return Optional.ofNullable(null);//.empty();
    }
    
    @Test
    void testDatabase() {
        Database.getInstance();

        DatabaseEnum instance = DatabaseEnum.INSTANCE;
        
    }
    
}
