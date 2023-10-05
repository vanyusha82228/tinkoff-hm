package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        LOGGER.info("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i <= 2; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            LOGGER.info("i = {}", i);
        }

//        System.out.println(Task1.getVideoLength("10:61"));
//        System.out.println(Task2.countDigits(-123));
//        int[] a ={9, 9, 8};
//        int[] b = {8, 9};
//
//        System.out.println(Task3.isNestable(a,b));
//
        System.out.println(Task7.rotateRight(8, 1));
        System.out.println(Task7.rotateLeft(16,1));
        System.out.println(Task7.rotateLeft(17,2));

//        System.out.println(Task4.fixString("123456"));
//        System.out.println(Task4.fixString("hTsii  s aimex dpus rtni.g"));
//        System.out.println(Task4.fixString("badce"));

//
//        System.out.println(Task5.isPalindromeDescendant(11211230));
//        System.out.println(Task5.isPalindromeDescendant(13001120));
//        System.out.println(Task5.isPalindromeDescendant(23336014));
//        System.out.println(Task5.isPalindromeDescendant(11));



    }
}
