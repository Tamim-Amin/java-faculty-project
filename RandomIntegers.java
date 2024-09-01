
package chapter6;

//Fig:6.6
import java.security.SecureRandom;


public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6);    //Pick random integer from 1 to 6

            System.out.printf("%d ", face);

            if (counter % 5 == 0)
                System.out.println();
        }
    }
}

