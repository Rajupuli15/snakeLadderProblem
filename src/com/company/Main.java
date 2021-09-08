package com.company;

public class Main {
    static final int noTurn = 0;
    static final int ladder = 1;
    static final int snake = 2;
    static int Sum = 0;

    public static void main(String[] args) {

        while (Sum < 100) {

            int dice = (int) (Math.random() * 6) + 1;

            System.out.println("Dice Roll is " + dice);

            int other = (int) Math.floor(Math.random() * 10) % 3;

            if (other == ladder) {
                if (Sum <=100 && (Sum + dice <=100))
                Sum = Sum + dice;
                System.out.println("Ladder");
            }
            else if (other == snake) {

                if (Sum > 0 && (Sum - dice) >= 0) {
                    Sum = Sum - dice;
                    System.out.println("Snake");
                }
            }
            else {
                System.out.println("NoTurn");
            }

        }
    }
}