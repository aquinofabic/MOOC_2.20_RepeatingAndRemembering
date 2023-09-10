import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        System.out.println("Give numbers:");
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int numberOfNumbers = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            int userInput = scanner.nextInt();


            if (userInput >= 0) {
                sumOfNumbers += userInput;
            } else if (userInput == -1) {
                break;
            }
            if (userInput % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            numberOfNumbers++;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sumOfNumbers);
        System.out.println("Numbers:" + numberOfNumbers);
        System.out.println("Average:" + ((double) sumOfNumbers / numberOfNumbers));
        System.out.println("Even:" + evenCount);
        System.out.println("Odd:" + oddCount);
    }
}


/*    Scanner reader = new Scanner(System.in);

1. Create variables needed for the loop

while (true) {
        2. read input

        3. end the loop -- break

        4. check for invalid input -- continue

        5. handle valid input
        }

6. functionality to execute after the loop ends
*/
