package pierwsze;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTesterTest {

    @ParameterizedTest
    @ValueSource(ints= {-1, 0, 1, 5, 1200673})
    public void liczbyPierwsze (Integer liczba) {
        assertTrue(PrimeTester.isPrime(liczba));
    };

    @ParameterizedTest
    @ValueSource(ints= {4, 10, 1200657})
    public void liczbyZlozone (Integer liczba) {
        assertFalse(PrimeTester.isPrime(liczba));
    };

}