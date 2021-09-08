package com.Timer;

public class Time {
    private int hour;
    private int minut;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minut = minute;
        this.second = second;
    }

    public Time(String currentTime) {
        String[] time = currentTime.split(":");
        hour = Integer.parseInt(time[0]);
        minut = Integer.parseInt(time[1]);
        second = Integer.parseInt(time[2]);
    }

    public String getCurrentTime() {
        return hour + ":" + minut + ":" + second;
    }

    public void oneSecondPassed() {
        second++;
        if (second == 60) {
            minut++;
            second = 0;
            if (minut == 60) {
                hour++;
                minut = 0;
                if (hour == 24) {
                    hour = 0;
                    System.out.println("Next day");
                }
            }
        }
    }
}