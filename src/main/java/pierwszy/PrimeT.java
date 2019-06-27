package pierwszy;

public class PrimeT {
    public static boolean isPrime(int liczba) {

        if (liczba < 2) {
            return false;
        } else {
            for (int i = 2; i <= liczba / 2; i++) {
                int reszta = liczba % i;
                if (reszta == 0) {
                    return false;
                }
            }
        } return true;
    }
}

//liczby pierwsze