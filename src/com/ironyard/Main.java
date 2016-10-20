package com.ironyard;

import java.util.ArrayList;

/**
 * Created by favianalopez on 10/19/16.
 */
public class Main {

    public static void main (String [] args){

        // should be no ticket
        Kata.caughtSpeeding(60, false);
        // should be no ticket because of birthday
        Kata.caughtSpeeding(66 - 5, true);
        // should be small ticket
        Kata.caughtSpeeding(65, false);
        //should be big ticket
        Kata.caughtSpeeding(85, false);

        Kata.sortaSum(3,4);
        Kata.sortaSum(9,4);
        Kata.sortaSum(10,11);

        Kata.love6(6,4);
        Kata.love6(4,5);
        Kata.love6(1,5);

        ArrayList<Integer> dealer = new ArrayList<>();
        dealer.add(1);
        dealer.add(7);
        dealer.add(3);
        ArrayList<Integer> player = new ArrayList<>();
        player.add(4);
        player.add(10);
        player.add(10);
        Kata.blackJack(dealer,player);

        ArrayList<Integer> dealerWin = new ArrayList<>();
        dealerWin.add(1);
        dealerWin.add(7);
        dealerWin.add(3);
        dealerWin.add(5);
        ArrayList<Integer> playerLose = new ArrayList<>();
        playerLose.add(4);
        playerLose.add(10);
        Kata.blackJack(dealerWin,playerLose);

        ArrayList<Integer> dealerLose = new ArrayList<>();
        dealerLose.add(1);
        dealerLose.add(7);
        dealerLose.add(6);
        ArrayList<Integer> playerWin = new ArrayList<>();
        playerWin.add(4);
        playerWin.add(10);
        playerWin.add(3);
        Kata.blackJack(dealerLose,playerWin);

        ArrayList<Integer> dealerBlackJack = new ArrayList<>();
        dealerBlackJack.add(11);
        dealerBlackJack.add(10);
        ArrayList<Integer> playerNoBlackJack = new ArrayList<>();
        playerNoBlackJack.add(4);
        playerNoBlackJack.add(10);
        playerNoBlackJack.add(3);
        Kata.blackJack(dealerBlackJack,playerNoBlackJack);

    }
}
