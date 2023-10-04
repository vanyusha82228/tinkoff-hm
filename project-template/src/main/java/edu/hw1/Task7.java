package edu.hw1;

public class Task7 {
    public static int rotateRight(int n, int shift) {
        return (n >>> shift) | (n << (Integer.SIZE - shift));
    }

    public static int rotateLeft(int n, int shift) {
        return (n << shift) | (n >>> (Integer.SIZE - shift)) & ((1 << shift) - 1);
    }

}

