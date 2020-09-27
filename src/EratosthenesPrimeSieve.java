import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{
    int max;
    List<Integer> primes = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(new EratosthenesPrimeSieve(100).isPrime(12));
        System.out.println(new EratosthenesPrimeSieve(100).isPrime(11));
    }

    public EratosthenesPrimeSieve(int max) {
        this.max = max;
    }

    @Override
    public boolean isPrime(int p) {
        return (p % 2) != 0 && (p % 3) != 0;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < max; i++) {
            if((i % 2) != 0 && (i % 3) != 0){
                System.out.println(i);
                primes.add(i);
            }
        }
    }

    //Beispiel 2

    @Override
    public void primeSieve() {
        printPrimes();
        boolean[] chechVal = new boolean[max];
        for (int i = 0; i < max / 2; i++) {
            for (int j = 0; j < max / 2; j++) {
                if(j>max)
                    break;
                int num = primes.get(i)+primes.get(j);
                if (num%2==0 && chechVal[num]){

                }
            }
            if(i>max)
                break;
        }
    }

}
