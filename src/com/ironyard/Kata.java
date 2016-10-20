package com.ironyard;

import java.util.ArrayList;

/**
 * Created by favianalopez on 10/19/16.
 */
public class Kata {

    public static void caughtSpeeding(int x, boolean y) {

        if (x == 60) {
            System.out.printf("caughtSpeeding(60,%s)->0", y);
        }

        if (y) {
            x = x - 5;
            System.out.printf("\ncaughtSpeeding(65,%s)->0", y);
        }

        if (x > 61 && x <= 81) {
            System.out.printf("\ncaughtSpeeding(65,%s)->1", y);
        }

        if (x > 82) {
            System.out.printf("\ncaughtSpeeding(85,%s)->2", y);
        }
    }

    public static void sortaSum(int a, int b) {

        int x = a + b;

        if (x < 10) {
            System.out.printf("\n\nsortaSum(%s,%s)->%s", a, b, x);
        } else if (x >= 10 && x <= 19) {
            System.out.printf("\nsortaSum(%s,%s)-> 20", a, b);
        } else {
            System.out.printf("\nsortaSum(%s,%s)->%s", a, b, x);
        }
    }

    public static void love6(int a, int b) {


        int sum = a + b;

        if (a == 6 || b == 6) {
            System.out.printf("\n\nlove6(%s,%s)->%s", a, b, true);
        } else if (sum == 6 || Math.abs(a - b) == 6) {
            System.out.printf("\nlove6(%s,%s)->%s", a, b, true);
        } else {
            System.out.printf("\nlove6(%s,%s)->%s", a, b, false);
        }
    }

    public static void blackJack(ArrayList<Integer> dealer, ArrayList<Integer> player) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < dealer.size(); i++) {
            x = x + dealer.get(i);
        }

        for (int j = 0; j < player.size(); j++) {
            y = y + player.get(j);
        }

        // dealer has more than 21 and not tied then player win
        // player has more than dealer AND player less than 21 then player wins
        // both are tie  THEN player wins
        //player has more than 21 and not tied then player looses
        // dealer has more than player AND dealer less than 21 then player looses
        boolean playerWon = false;

        if (x > 21 && x != y) {
            playerWon = true;

        } else if (y > x && y <= 21) {
            playerWon = true;
        } else if (y == x) {
            playerWon = true;
        }


        if (playerWon) {
            System.out.printf("\nblackJack(%s, %s)-> Player", dealer, player);
        } else {
            System.out.printf("\nblackJack(%s, %s)-> Dealer", dealer, player);

        }

        if (y == 21 || x == 21) {
            System.out.print("BlackJack!");

        }
    }
}



