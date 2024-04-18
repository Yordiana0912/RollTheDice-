package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1 = 0;
        int roll2 = 1;

        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            
        }



    }


}
