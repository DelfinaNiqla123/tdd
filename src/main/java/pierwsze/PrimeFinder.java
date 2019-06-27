package pierwsze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrimeFinder {
    public static Collection find(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException("Podano niewłaściwe n: " + n);
        }

        int licznik = 0;
        int liczba = 2;
        List<Integer> liczbyPierwsze = new ArrayList();
        while (licznik < n) {
            if (PrimeTester.isPrime(liczba) == true) {
                liczbyPierwsze.add(liczba);
                licznik++;
            }
            liczba++;
        }
        return liczbyPierwsze;
    }


    public static void main(String[] args) {
        System.out.println(find(-1));
    }
}