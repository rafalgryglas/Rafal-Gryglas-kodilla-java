package com.kodilla;

import com.kodilla.rps.Game;
import com.kodilla.rpsls.GameRPSLS;
import com.kodilla.rpslsCompCheating.GameRPSLSCheating;

import java.util.Scanner;

public class AllGamesRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the game you want to play: (1) - RPS, (2) - RPSLS, (3)-RPSLS Computer Cheating :), (4)-EXIT");
            String s = scanner.nextLine();
            if (s.equals("1")) {
                Game game = new Game();
                game.playGame();
            } else if (s.equals("2")) {
                GameRPSLS gameRPSLS = new GameRPSLS();
                gameRPSLS.playGame();
            } else if (s.equals("3")) {
                GameRPSLSCheating gameRPSLSCheating = new GameRPSLSCheating();
                gameRPSLSCheating.playGame();
            } else if (s.equals("4")) {
                System.out.println("See you next time");
                return;
            } else {
                System.out.println("Wrong key, try: (1), (2), (3), (4)");
            }
        }
    }
}