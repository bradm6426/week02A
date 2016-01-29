package com.company;

public class Main {

    public static void main(String[] args) {
      String[] weekDays = {"sun", "mon", "tues",
              "wed", "thurs", "fri", "sat"};
        int [] temps = {45, 29, 10, 22, 41, 28, 33};
        int[] precip = {95, 60, 25, 5, 0, 75, 90};
        for (int index = 0; index< weekDays.length; index++){
            if((temps[index]<= 32)&&(precip[index]>50)){
                System.out.println(weekDays[index]);
            }
        }
    }
}
