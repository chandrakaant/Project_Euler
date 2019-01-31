/**
 * @author chandrakant
 *
 *

The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


 */

public class Problem4 {

        public static void main(String [] args){
            int sumNatural = 0;
            int sumNaturalSqure = 0;

            for (int i=1; i<=100; i++){
                sumNatural += i;
                sumNaturalSqure += (i*i);
            }

            sumNatural = sumNatural*sumNatural;
            System.out.println(sumNatural);
            System.out.println(sumNaturalSqure);

            System.out.println(sumNaturalSqure - sumNatural);
        }

}
