package edu.hw1;

public class Task1 {
    public static int getVideoLength(String videoLength) {
        String[] dividedTime = videoLength.split(":");
        int minutes = 0;
        int seconds = 0;
        if (dividedTime.length == 2) {
            minutes = Integer.parseInt(dividedTime[0]);
            seconds = Integer.parseInt(dividedTime[1]);
        } else {
            System.out.println("Некоректное время");
        }

        if (minutes<0 || seconds<0){
            System.out.println("Некоректное время");
        }

        if (seconds >= 60) {
            return -1;
        } else {
            return minutes * 60 + seconds;
        }
    }
}
