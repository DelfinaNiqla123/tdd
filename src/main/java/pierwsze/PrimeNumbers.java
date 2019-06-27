package pierwsze;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {

        {
            int temp;
            boolean isPrime=true;
            Scanner scan= new Scanner(System.in);
            System.out.println("Wpisz dowolną liczbę:");

            int num=scan.nextInt();
            scan.close();
            for(int i=2;i<=num/2;i++)
            {
                temp=num%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }

            if(isPrime)
                System.out.println(num + " jest liczbą pierwszą");
            else
                System.out.println(num + " nie jest liczbą pierwszą");
        }
    }
}
