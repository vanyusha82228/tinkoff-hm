package edu.hw1;

public class Task5 {
    public static boolean isPalindromeDescendant(int number) {
        if (isPalindrome(number)) {
            return true;
        } else {
            int descendant = createDescendant(number);
            return isPalindrome(descendant);
        }
    }

    public static int createDescendant(int number) {
        while (!isPalindrome(number)) {
            String numberString = Integer.toString(number);
            StringBuilder resultNumber = new StringBuilder();
            if (numberString.length() % 2 != 0) {
                System.out.println("Введина не четная длинна числа ");
            } else {
                for (int i = 0; i < numberString.length(); i += 2) {
                    int digit1 = Character.getNumericValue(numberString.charAt(i));
                    int digit2 = Character.getNumericValue(numberString.charAt(i + 1));
                    int sumDigit = digit1 + digit2;
                    resultNumber.append(sumDigit);
                }
                number = Integer.parseInt(resultNumber.toString());
            }
        }
        return number;
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int revers = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            revers = revers * 10 + remainder;
            palindrome /= 10;
        }
        return number == revers;
    }
}

