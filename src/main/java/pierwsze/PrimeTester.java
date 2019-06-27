package pierwsze;

public class PrimeTester {

    public static boolean isPrime(int liczba) {
        //kod na sprawdzenie czy liczba jest pierwsza:

        boolean isPrime = true;
        int temp;
        for (int i = 2; i <= liczba / 2; i++) {
            temp = liczba % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}