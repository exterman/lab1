public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) 
            if (isPrime(i)) 
                System.out.println(i);
    }
    public static boolean isPrime(int n){
        boolean is_Prime = true;
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0) is_Prime = false;
        return is_Prime;
    }
}
