package edu.hw1;


import java.util.Arrays;

public class Task6 {
    public static int countK(int number) {
        if (number == 6174) {
            return 0;
        }
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        Arrays.sort(digits);
        int[] reversDigits = new int[4];
        for (int i = 0; i < 4; i++) {
            reversDigits[i] = digits[3 - i];
        }
        int asc = arrayToNumber(digits);
        int desc = arrayToNumber(reversDigits);

        int differences = desc - asc;
        int steps = countK(differences);
        if (steps == -1) {
            return -1;
        }
        return steps + 1;

    }

    public static int arrayToNumber(int[] array) {
        int number = 0;
        for (int digit : array) {
            number = number * 10 + digit;
        }
        return number;
    }
}
