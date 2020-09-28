import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{
    int max;
    List<Integer> primes = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(new EratosthenesPrimeSieve(100).isPrime(12));
        System.out.println(new EratosthenesPrimeSieve(100).isPrime(11));
        new EratosthenesPrimeSieve(100).primeSieve();
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
            }
        }
    }

    //Beispiel 2

    private void listPrimes(){
        primes.add(2);
        primes.add(3);
        for (int i = 3; i<max*2;i++){
            if((i % 2) != 0 && (i % 3) != 0){
                primes.add(i);
            }
        }
    }
    @Override
    public void primeSieve() {
        printPrimes();
        listPrimes();
        boolean[] checkVal = new boolean[max+1];
        Arrays.fill(checkVal, true);
        for (int i = 0; i < max / 2; i++) {
            for (int j = 0; j < max / 2; j++) {
                if(j>max)
                    break;
                try {
                    int num = primes.get(i) + primes.get(j);
                    if (num%2==0 && checkVal[num]){
                        checkVal[num] = false;
                        System.out.println(num+" = "+primes.get(i)+" + "+primes.get(j));
                    }
                }catch (IndexOutOfBoundsException e){
                    break;
                }

            }
            if(i>max)
                break;
        }
    }

}
