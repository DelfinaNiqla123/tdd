package edu.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

//assertFalse(PostalCodeValidator.validator.validate(postalCode));

class WalidatorKodowPocztowychTest {

    @Test
    public void poprawneKody() {
        WalidatorKodowPocztowych walidatorKodowPocztowych = new WalidatorKodowPocztowych();
        assertTrue(walidatorKodowPocztowych.czyPoprawny("54-980"));
        assertTrue(walidatorKodowPocztowych.czyPoprawny("00-000"));
        assertTrue(walidatorKodowPocztowych.czyPoprawny("36-100"));
        assertTrue(walidatorKodowPocztowych.czyPoprawny("23-567"));
        assertTrue(walidatorKodowPocztowych.czyPoprawny("12-345"));
    }

    @Test
    public void niepoprawneKody() {
        WalidatorKodowPocztowych walidatorKodowPocztowych = new WalidatorKodowPocztowych();
        assertFalse(walidatorKodowPocztowych.czyPoprawny("aw-980"));
        assertFalse(walidatorKodowPocztowych.czyPoprawny("kasia"));
        assertFalse(walidatorKodowPocztowych.czyPoprawny("1-3456"));
        assertFalse(walidatorKodowPocztowych.czyPoprawny(" "));
        assertFalse(walidatorKodowPocztowych.czyPoprawny("-&%hhh"));
        assertFalse(walidatorKodowPocztowych.czyPoprawny("null"));
    }


    @ParameterizedTest
    @ValueSource(strings = {"00-000", "99-999", "35-021", "54-098", "12-345"})
    public void valid(String postalCode) {
        WalidatorKodowPocztowych walidatorKodowPocztowych = new WalidatorKodowPocztowych();
        assertTrue(walidatorKodowPocztowych.czyPoprawny(postalCode));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aw-980", "kasia", "1-3456", "", "-&%hhh", "null"})
    public void inCorrect(String postalCode) {
        WalidatorKodowPocztowych walidatorKodowPocztowych = new WalidatorKodowPocztowych();
        assertFalse(walidatorKodowPocztowych.czyPoprawny(postalCode));
    }


    //JUnit5 - nowe:
    //@NullAndEmptySource
    //@NullSource

    @ParameterizedTest
    @NullAndEmptySource
    public void inCorrecto(String postalCode) {
        WalidatorKodowPocztowych walidatorKodowPocztowych = new WalidatorKodowPocztowych();
        assertFalse(walidatorKodowPocztowych.czyPoprawny(postalCode));
    }
}
