
package chapter4;

import java.util.Scanner;
//Fig 4.12
public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes++;
            } else {
                failures++;
            }

            studentCounter++;
        }

        System.out.printf("Number of passes: %d%n", passes);
        System.out.printf("Number of failures: %d%n", failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
