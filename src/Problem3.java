/**
 *
 *
 * Largest prime factor
 *

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */

public class Problem3 {
    public static void main(String[] args){
        System.out.println(maxPrimeFactors(600851475143l));
    }

    static long maxPrimeFactors(long n)
    {
        long maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;

            n >>= 1;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }

        if (n > 2)
            maxPrime = n;

        return maxPrime;
    }
}
