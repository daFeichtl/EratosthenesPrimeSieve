public class EratosthenesPrimeSieve implements PrimeSieve{
    int max;

    public EratosthenesPrimeSieve(int max) {
        this.max = max;
    }

    @Override
    public boolean isPrime(int p) {
        return (p % 2) != 0 && (p % 3) != 0;
    }

    @Override
    public void printPrimes() {

    }
}
