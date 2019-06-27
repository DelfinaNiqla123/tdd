package pierwsze;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
class PrimeFinderTest {
    @ParameterizedTest
    @ValueSource (ints = {2460})
    public void findNumberN (Integer liczba){
        assertEquals(2460, PrimeFinder.find(2460).size());
    }
    @Test
    public void wyjątki(){
        assertThrows(IllegalArgumentException.class,() -> PrimeFinder.find(-1));
    }
}








