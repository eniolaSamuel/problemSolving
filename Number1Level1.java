package testProblemSolving;

import java.util.Scanner;

public class Number1Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float largest = Float.NEGATIVE_INFINITY;
        float secondLargest = Float.NEGATIVE_INFINITY;

        System.out.print("Input number or Input 0 to end: ");
        int inputNumber = input.nextInt();


        while (inputNumber != 0) {

            if (inputNumber > largest) {
                largest = inputNumber;
            }

            if (inputNumber > secondLargest && inputNumber < largest) {
                secondLargest = inputNumber;
            }
            System.out.print("Input number or enter 0 to end: ");
            inputNumber = input.nextInt();

        }
        System.out.printf("The second largest number is %f%n", secondLargest);

    }
}

