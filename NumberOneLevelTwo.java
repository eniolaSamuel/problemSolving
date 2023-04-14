package testProblemSolving;

import java.util.Scanner;

public class NumberOneLevelTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        int binaryNumber = input.nextInt();

        int result = 0;
        int multiplier = 1;
        while (binaryNumber != 0) {
            result += binaryNumber % 10 * multiplier;
            multiplier = multiplier * 2;
            binaryNumber = binaryNumber / 10;

        }
        System.out.println(result);
    }
        }
