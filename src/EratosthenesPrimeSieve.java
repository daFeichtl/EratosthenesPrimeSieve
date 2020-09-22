public class EratosthenesPrimeSieve implements PrimeSieve{
    int max;
    int[] primes = new int[1000];
    int primesCounter=0;

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
                primes[primesCounter]=i;
                primesCounter++;
            }
        }
    }
}
