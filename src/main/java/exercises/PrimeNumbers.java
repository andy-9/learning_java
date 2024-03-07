package exercises;

import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        for (int num = 2; num < 1000; num++) {
            boolean isPrime = true;

            for (int div = 2; div * div <= num; div++) { // stop the loop once the square of the divisor is less than or equal to the number

                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(num);
            }
        }

        System.out.println(primeNumbers);
    }
}
