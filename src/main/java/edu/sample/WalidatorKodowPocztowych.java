package edu.sample;

//wyrażenia regularne
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WalidatorKodowPocztowych {

    public static final String POSTAL_CODE_REG_EX = "[0-9]{2}-[0-9]{3}";

    public static boolean czyPoprawny(String kodPocztowy) {
        if (kodPocztowy == null) {
            return false;
        }
        Pattern pattern = Pattern.compile (POSTAL_CODE_REG_EX);
        Matcher matcher = pattern.matcher (kodPocztowy);
        return matcher.matches();
    }
}
//Red-green-refactor

//maven to narzedzie do automatyzacji "buildu"-kompilujace, uruchamiajace, kopiujace, przenoszace plikow, waliduje,
//