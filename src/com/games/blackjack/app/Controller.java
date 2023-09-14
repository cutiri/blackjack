package com.games.blackjack.app;

import com.games.blackjack.Dealer;

import java.util.Scanner;

public class Controller {
    private Dealer dealer;
    private final Scanner scanner = new Scanner(System.in);

    public void Execute(){
        welcome();
        int numPlayers = promptForNumPlayers();
        promptForPlayerNames();
        //dealer.delCards();
    }

    private void promptForPlayerNames() {
    }

    private int promptForNumPlayers() {
        return 0;
    }

    private void welcome() {
        System.out.println("WELCOME TO BLACKJACK");
    }
}
